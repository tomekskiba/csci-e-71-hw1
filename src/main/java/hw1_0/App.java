package hw1_0;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int sum = sum(10, 20);
        System.out.println("Sum of two integers is " + sum);
    }
    
    public static int sum(int x, int y) 
    {
    	return x + y;
    }
}
