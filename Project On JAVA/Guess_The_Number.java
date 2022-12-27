import java.util.Scanner;
import java.util.Random;

public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int Rand = r.nextInt(100);
        int count = 0, num;
        do {
            System.out.print("Enter the number please:");
            num = sc.nextInt();
            if (num > Rand) {
                System.out.println("Enter Lower number Please...");
            } else if (num < Rand) {
                System.out.println("Enter Higher number Please...");
            }
            count++;
        } while (num != Rand);
        System.out.println("You Guess the number " + Rand + " in " + count + " attempts");
    }
}
