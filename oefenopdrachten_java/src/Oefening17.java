import java.util.Scanner;

public class Oefening17
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner (System.in);
        System.out.print("Voer een stukje tekst in: ");
        String user_input1 = scan1.nextLine();

        Scanner scan2 = new Scanner (System.in);
        System.out.print("Voer nog een stukje tekst in: ");
        String user_input2 = scan2.nextLine();

        Scanner scan3 = new Scanner (System.in);
        System.out.print("Voer het laatste stukje tekst in: ");
        String user_input3 = scan3.nextLine();



        System.out.println(user_input1 + " " + user_input2 + " " + user_input3);
    }
}
