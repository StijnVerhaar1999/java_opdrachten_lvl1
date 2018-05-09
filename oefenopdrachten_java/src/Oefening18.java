public class Oefening18
{
    public static void main(String args[])
    {
        int max = 6;

        for (int counter = 0; counter <= max; counter++)
        {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    }
    public static long factorial(long number)
    {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }
}