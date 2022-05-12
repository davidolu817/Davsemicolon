package tdd;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main (String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter your score");
        int userInput = Input.nextInt();

        if (userInput > 30) {
            System.out.print("*****");
        }




        }
    }
