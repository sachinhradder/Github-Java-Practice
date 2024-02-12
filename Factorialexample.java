public class Factorialexample 
{
    public static void main(String[] args) 
    {


        // 546 print the last digit in the given number

        int a = 546;
        int lastdigit = a%10;
        System.out.println("The last digit in the given number is " + lastdigit);

        // 984 print the remaining digits except last digit in the given number

        int b = 984;
        int exceptlastdigit = b/10;
        System.out.println("The digits except lastdigit is " +exceptlastdigit);

        int number = 5;
        int factorial = 1;

        for (int i=1; i<=number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("The factorial of number 5 is "+ factorial);

        int x=10;
        for (int i=0; i<10; i++)
        {
            // System.out.println(i);
            // System.out.println(x);
             x = x+i;
            //System.out.print(x);
            System.out.print("\t");

        }
        System.out.println("The sum of the addition of all the iteration is "+ x);
    }
    
}
