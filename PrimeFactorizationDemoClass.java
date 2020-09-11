//SUNDAR RAJ
import java.util.Scanner;

public class PrimeFactorizationDemoClass
{
    public static void main(String[] args)
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            ArrayStackDataStrucClass<Integer> stack = new ArrayStackDataStrucClass<Integer>(50);

            System.out.print("Prime factorization of number: ");
            int n = keyboard.nextInt();

            for(int d = 2; d <= n; d++)
            {
                while(n % d == 0)
                {
                    stack.push(d);
                    n /= d;
                }
            }

            System.out.print(stack.peek());
            stack.pop();
            while(!stack.isEmptyStack())
            {
                System.out.print(" * " + stack.peek());
                stack.pop();
            }
            System.out.println();
        }

        catch(StackOverflowException sofe)
        {
            System.out.println(sofe);
        }

        catch(StackUnderflowException sufe)
        {
            System.out.println(sufe);
        }

        catch(StackException se)
        {
            System.out.println(se);
        }
    }
}