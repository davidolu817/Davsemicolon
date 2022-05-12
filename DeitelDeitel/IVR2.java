package tdd;

import java.util.Scanner;

public class IVR2 {
    public static void main(String[] args) {
        Scanner KeyboardInput = new Scanner(System.in);
        String prompt = """
                1 - for English
                2 - for Igbo
                3 - for French
                4 - for Yoruba
                """;
        System.out.print("prompt");
        int userResponse = KeyboardInput.nextInt();
        switch (userResponse){
            case 1:
                prompt = """
                        1 - for data
                        2 - for transfer
                        """;
                System.out.println("prompt");
                userResponse = KeyboardInput.nextInt();
                switch (userResponse){
                    case 1:
                        System.out.println("data");
                        break;
                    case 2:
                            System.out.println("transfer");
                            break;
                    default:
                        System.out.println("May God give u sense");
                }
                break;
            case 2:
                prompt = """
                        1 - for Sharing
                        2 - for Caring
                        """;
                System.out.println(prompt);
                userResponse = KeyboardInput.nextInt();
                switch (userResponse){
                    case 1:
                        System.out.println("Sharing");
                        break;
                    case 2:
                        System.out.println("Caring");
                        break;
                    default:
                        System.out.println("See ur head");
                }
                break;
            case 3:
                prompt = """
                        1 - Egg
                        2 - Campaign
                        """;
                System.out.println(prompt);
                userResponse = KeyboardInput.nextInt();
                switch (userResponse){
                    case 1:
                        System.out.println("Egg");
                        break;
                    case 2:
                        System.out.println("Campaign");
                        break;
                    default:
                        System.out.println("if i get u");
                }
                break;
            case 4:
                prompt = """
                        1 - Ewa
                        2 - Akara
                        """;
                System.out.println(prompt);
                userResponse = KeyboardInput.nextInt();
                switch (userResponse){
                    case 1:
                        System.out.println("Ewa");
                        break;
                    case 2:
                        System.out.println("Akara");
                        break;
                    default:
                        System.out.println("Are u high");
                }


        }

    }
}
