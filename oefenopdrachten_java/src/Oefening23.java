import java.util.Scanner;

public class Oefening23
{
    public static void main (String[] args)
    {
        int length;
        Scanner input = new Scanner(System.in);

        System.out.println("Hoe veel vrienden ga je invullen?");
        length = input.nextInt();

        String[] names = new String[length];

        for(int counter = 0; counter < length; counter++)
        {
            System.out.println("Voer de naam in van vriend " +(counter+1));
            names[counter] = input.next();
        }

        input.close();

        System.out.println("Jouw vrienden zijn:");
        for(int counter = 0; counter <length; counter++)
        {
            System.out.println(names[counter]);
        }

    }
}
