import java.util.Scanner;

public class FinApp {
	public static void main(String... args)  {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the balance and interest rate: ");
                int Balance = input.nextInt();
		double InterestRate = input.nextDouble();


		double interest = Balance * (InterestRate/1200);

		System.out.printf("The Interest is %f" ,interest);




       }

}








