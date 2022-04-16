import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

   
	System.out.print("Enter the distance of the drive: ");
	double DrivingDistance = input.nextDouble();

	
	System.out.print("Enter the miles per gallon: ");
	double MilesPerGallon = input.nextDouble();


	System.out.print("Enter the price per gallon: ");
	double PricePerGallon = input.nextDouble();

	double CostOfDriving = DrivingDistance / MilesPerGallon * PricePerGallon;

	
	System.out.printf("The cost of driving is %.2f ", CostOfDriving);

	

}


					



}