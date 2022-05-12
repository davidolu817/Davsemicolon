package tdd;
//Prompt user to enter score
//if score is between 90 and 100 then print out  A
// if score is between 80 and 89 then print out  B
//if score is between 70 and 79 then  print out  C
//if score is between 60 and 69 then   print out D
//if score is below 60 then    print out   F
import java.util.Scanner;

public class SchoolResult {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score");
        int score = input.nextInt();

        if (score <= 100) {
            if (score > 90 ){
                System.out.print("A");

            }
        }
        if (score >= 80 ) {
            if (score < 90) {
                System.out.print("B");
            }

        }
        if (score >= 70 ) {
            if (score < 80){
                System.out.print("C");
            }
        }
        if (score >= 60 ) {
            if (score < 70 ) {
                System.out.print("D");
            }
        }
        if (score <= 60 ) {
            System.out.print("F");
        }
    }

}