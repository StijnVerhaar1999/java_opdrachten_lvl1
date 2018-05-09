import java.util.Arrays;
import java.util.Scanner;

public class Oefening25
{
    public static void main (String[] args)
    {
        String[] Kleuren = {"Geel", "Oranje", "Groen", "Wit", "Blauw"};
        String[] Fruit = {"Banaan", "Sinaasappel", "Appel", "Kokos", "Druif"};

        System.out.println("Voer de kleur van het fruit in je kunt kiezen uit: " + Arrays.toString(Kleuren));
        Scanner input = new Scanner(System.in);

        String kleur = input.nextLine();

        if(kleur.equals(Kleuren[0]))
        {
            System.out.println(Fruit[0]);
        }
        else if(kleur.equals(Kleuren[1]))
        {
            System.out.println(Fruit[1]);
        }
        else if(kleur.equals(Kleuren[2]))
        {
            System.out.println(Fruit[2]);
        }
        else if(kleur.equals(Kleuren[3]))
        {
            System.out.println(Fruit[3]);
        }
        else if(kleur.equals(Kleuren[4]))
        {
            System.out.println(Fruit[4]);
        }
        else
        {
            System.out.println("Geen mogelijkheid gevonden");
        }
    }
}
