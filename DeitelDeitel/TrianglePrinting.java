package tdd;

public class TrianglePrinting {
    public static void main(String[] args) {

        for (int row = 1; row <= 11; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row =11 ; row > 1; row--) {
            for (int column = 1; column < row; column ++) {
                System.out.print("x ");
            }
            System.out.println();

        }
        System.out.println();
        for (int row = 1; row <= 11; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int i = row; i <= 11 ; i++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println();
        for (int row =11 ; row > 1; row--) {
            for (int column = 1; column < row; column ++){
                System.out.print("  ");
            }
            for (int i = 11; i <= 1; i--) {
                System.out.println("*  ");
            }
            System.out.println();

        }

    }
}