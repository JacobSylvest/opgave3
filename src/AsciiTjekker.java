import java.util.Scanner;

public class AsciiTjekker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //husk dette, da det eer en "klassisk" input metode.
        String inputString = in.nextLine();
        while (!inputString.equals("exit")){
            char inputChar = inputString.charAt(0);

            if (inputChar >= 'A' && inputChar <= 'Z')
                System.out.println("Tegnet er et stort bogstav");
            else if (inputChar >= 'a' && inputChar <= 'z')
                System.out.println("Tegnet er et lille bogstav");
            else if (inputChar >= '0' && inputChar <= '9')
                System.out.println("Tegnet er et tal");
            else if (inputChar =='#' || inputChar =='!' || inputChar =='+' || inputChar =='\\')
                System.out.println("Tegnet er et af de 4 specialtegn");
            else
                System.out.println("Tegnet er ikke kendt af dette program");
            inputString = in.nextLine();

        }

    }
}
