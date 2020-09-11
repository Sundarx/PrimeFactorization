//SUNDAR RAJ
public interface ArrayStackADT<T>
{
    //Initializes stack
    public abstract void initializeStack();

    //Returns true if empty stack, false if not empty
    public abstract boolean isEmptyStack();

    //Returns true if full stack, false if not full
    public abstract boolean isFullStack();

    //If stack is not full, add T item to the stack
    //If stack is full, throw StackOverflowException
    public abstract void push(T newItem) throws StackOverflowException;

    //If stack is not empty, retrieve T item at the top of stack
    //If stack is empty, throw StackUnderflowException
    public abstract T peek() throws StackUnderflowException;

    //If stack is not empty, remove T item from the top of stack
    //If stack is empty, throw StackUnderflowException
    public abstract void pop() throws StackUnderflowException;
}