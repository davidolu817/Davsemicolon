package tdd;

import java.util.Scanner;

public class IVR {
    public static void main (String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.print("1 for english \n 2 for igbo \n 3 for french \n 4 for yoruba");
        int userInput = Input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Enter 1 for data\n" +
                        "Enter 2 for Transfer \n");
                int plan = Input.nextInt();
                switch (plan){
                    case 1: System.out.println("Data");
                    break;
                    case 2: System.out.println("Transfer");
                    break;
                }
                break;
                    case 2:
                        System.out.println("Enter 1 for Sharing\n" +
                                "Enter 2 for Caring \n");
                        int love = Input.nextInt();
                        switch (love){
                            case 1: System.out.println("Sharing");
                                break;
                            case 2: System.out.println("Caring");
                                break;
                        }
                        break;
                            case 3:
                                System.out.println("Enter 1 for Egg\n" +
                                        "Enter 2 for Champagne \n");
                                int food = Input.nextInt();
                                switch (food){
                                    case 1: System.out.println("Egg");
                                        break;
                                    case 2: System.out.println("Champagne");
                                        break;
                                }
                                break;
                                    case 4:
                                        System.out.println("Enter 1 for Ewa\n" +
                                                "Enter 2 for Agoyin \n");
                                        int feed = Input.nextInt();
                                        switch (feed){
                                            case 1: System.out.println("Ewa");
                                                break;
                                            case 2: System.out.println("Agoyin");
                                                break;
                                        }
            }
        }
    }
