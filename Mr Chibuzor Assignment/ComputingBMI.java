import java.util.Scanner;

public class ComputingBMI {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter Weight in pounds: ");
        double weight = Input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = Input.nextDouble();

        double weightInKg = Weight * 0.45359237;
        double heightInMeters = Height * 0.0254;

        double BMI = WeightInKg / Math.pow(HeightInMeters, 2);

        System.out.printf("BMI is %.4f", BMI);
    }
}