package ifwhile3;

import java.util.Scanner;

public class code328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter r1's center x-,y-coordinates, width, and height: ");
		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double w1=input.nextDouble();
		double h1=input.nextDouble();
		
		
		System.out.print("Enter r2's center x-,y-coordinates, width, and height: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double w2=input.nextDouble();
		double h2=input.nextDouble();
		
		
		if(Math.abs(x1-x2)>(w1+w2)/2 || Math.abs(y1-y2)>(h1+h2)/2) {
			System.out.println("r2 does not overlap r1");
		}
		else if(Math.abs(x1-x2)<Math.abs(w1-w2)/2 || Math.abs(y1-y2)<Math.abs(h1-h2)/2) {
			System.out.println("r2 is inside r1");
		}
		else {
			System.out.println("r2 overlaps r1");
		}

	}
}