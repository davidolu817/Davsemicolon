package tdd;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer");
        int number = input.nextInt();

        if (number < 1)

        System.out.print("Enter a number greater than 1" + "Perform the program again");

        else if (number == 2)
            System.out.print("It is a PrimeNumber");

        else if (number % 2 == 0)
            System.out.print("It is not a PrimeNumber");



    }
}
