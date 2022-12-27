import java.util.Scanner;
import java.util.Random;

public class Stone_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int m = 0, c = 0;
        for (int i = 1; i <= 5; i++) {
            int Rand = r.nextInt(3);
            System.out.println("Enter (0) for Rock:");
            System.out.println("Enter (1) for Paper:");
            System.out.println("Enter (2) for Scissor:");
            System.out.print("Your turn press either 0,1,2:");
            int num = sc.nextInt();
            if (num == 0 && Rand == 2 || num == 1 && Rand == 0 || num == 2 && Rand == 1) {
                m++;
            } else {
                c++;
            }
        }
        System.out.println("Your Score m=" + m);
        System.out.println("CPU Score c=" + c);
        if (m > c) {
            System.out.println("You are the Winner.. Lead points: " + (m - c));
        } else if (c > m) {
            System.out.println("CPU is Winner you Lose.. leading points:" + (c - m));
        } else {
            System.out.println("Match is Draw...!");
        }
    }
}