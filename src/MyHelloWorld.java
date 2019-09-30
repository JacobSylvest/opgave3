import java.util.Scanner;

public class MyHelloWorld
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv dit fornavn tak: ");
        String fornavn = input.next();
        System.out.print(" skriv dit efternavn tak: ");
        String efternavn = input.next();
        System.out.println();
        System.out.println("hej med dig \n"+fornavn+" "+efternavn);
    }
}
