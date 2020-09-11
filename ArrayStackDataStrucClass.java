//SUNDAR RAJ
public class ArrayStackDataStrucClass<T> implements ArrayStackADT<T>
{
    private int maxSize;
    private int stackTop;
    private T[] stackArr;

    public ArrayStackDataStrucClass()
    {
        maxSize = 100;
        stackTop = 0;
        stackArr = (T[]) new Object[maxSize];
    }

    public ArrayStackDataStrucClass(int size)
    {
    	if(size <= 0)
        {
            System.out.print("The size of the array to implement"
                             + " the stack must be positive.");
        }
        else
        {
            maxSize = size;
            stackTop = 0;
            stackArr = (T[]) new Object[maxSize];
		}
    }

    public ArrayStackDataStrucClass(ArrayStackDataStrucClass<T> copyStack)
    {
		if(!copyStack.isEmptyStack())
		{
        	maxSize = copyStack.maxSize;
        	stackTop = copyStack.stackTop;
        	stackArr = (T[]) new Object[maxSize];

        	while(!copyStack.isEmptyStack())
        	{
				this.push((T)copyStack.peek());
				copyStack.pop();
			}
		}
		else
		{
			throw new StackUnderflowException();
		}
    }

    //Initializes stack
    public void initializeStack()
    {
        for(int i = 0; i < stackTop; i++)
        {
            stackArr[i] = null;
        }

        stackTop = 0;
    }

    //Returns true if empty stack, false if not empty
    public boolean isEmptyStack()
    {
        return (stackTop == 0);
    }

    //Returns true if full stack, false if not full
    public boolean isFullStack()
    {
        return (stackTop == maxSize);
    }

    //If stack is not full, add T item to the stack
    //If stack is full, throw StackOverflowException
    public void push(T newItem) throws StackOverflowException
    {
        if(isFullStack())
        {
            throw new StackOverflowException();
        }

        stackArr[stackTop] = newItem;
        stackTop++;

    }

    //If stack is not empty, retrieve T item at the top of stack
    //If stack is empty, throw StackUnderflowException
    public T peek() throws StackUnderflowException
    {
        if(isEmptyStack())
        {
            throw new StackUnderflowException();
        }

        return (T)stackArr[stackTop - 1];
    }

    //If stack is not empty, remove T item from the top of stack
    //If stack is empty, throw StackUnderflowException
    public void pop() throws StackUnderflowException
    {
        if(isEmptyStack())
        {
            throw new StackUnderflowException();
        }

        stackTop--;
        stackArr[stackTop] = null;
    }
}