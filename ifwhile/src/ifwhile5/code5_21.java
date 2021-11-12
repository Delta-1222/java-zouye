package ifwhile5;

import java.util.Scanner;

public class code5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double total=input.nextDouble();
		
		System.out.print("Nmuber of Years: ");
		int year=input.nextInt();
		
		for(double i=5.0;i<8.0;i+=0.125) {
			for(int j=1;j<=year;j++) {
				total*=i;
			}
			System.out.printf("%.3f/%    %.2f    %.2f",i,total/60,total);
		}
		

	}

}
