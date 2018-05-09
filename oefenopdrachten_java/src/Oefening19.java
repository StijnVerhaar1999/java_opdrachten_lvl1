public class Oefening19
{
    public static void main (String args[])
    {
        String woord = "Voorbeeld";
        String[] gesplitstWoord1 = woord.split("");
        for (String gesplitstWoord2 : gesplitstWoord1)
        {
            System.out.println(gesplitstWoord2);
        }
    }

}
