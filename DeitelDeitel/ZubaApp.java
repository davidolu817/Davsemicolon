package tdd;
//prompt the user to enter a nos or a score
//if the user enters 50 & above it says (pass),if it's
//lesser than 50 it says (fail).
import java.util.Scanner;

public class ZubaApp {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score");
        int userInput = input.nextInt();

        if (userInput >= 50) {
            System.out.print("pass");
        }

        if (userInput < 50) {
            System.out.print("failed");
        }

    }
}
