import java.util.Collections;

public class Oefening20
{
    public static void main (String args[])
    {
        int max = 7;

        for(int i=1; i<max; i++)
        {
            int aantalGetallen = 10;

            System.out.println(String.join("", Collections.nCopies(aantalGetallen,  "0")));
        }
    }
}
