public class Oefening12
{
    public static void main(String[] args)
    {
        int score = 30;

        switch (score)
        {
            case 100 :
            case 90 :
                System.out.println("Noice");
                break;
            case 80 :
            case 70 :
            case 60 :
                System.out.println("Oke");
                break;
            case 50 :
            case 40 :
            case 30 :
                System.out.println("Not noice");
                break;
            case 20 :
            case 10 :
            case 0 :
                System.out.println("Not oke");
                break;
        }
    }
}
