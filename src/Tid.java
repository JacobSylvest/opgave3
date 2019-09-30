import java.util.Scanner;

public class Tid {
    final static int DAGE = 60*60*24;
    final static int TIMER = 60*60;
    final static int MIN = 60;

    public static void main(String[] args) {
        //System.out.println("indtast et antal sekunder: ");
        Scanner in = new Scanner(System.in);
        int sekunder = in.nextInt();

        int dage = sekunder / DAGE;
        int timer = (sekunder % DAGE) / TIMER;
        int minutter = ((sekunder % DAGE) % TIMER) / MIN;
        int sekundrest = ((sekunder % DAGE) % TIMER) % MIN;
        System.out.println(sekunder + " seconds equals " + dage + " days, "+ timer+" hours, "+ minutter +" minutes and " + sekundrest +" seconds.");
    }
}
