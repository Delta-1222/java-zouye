package ifwhile3;

import java.util.Scanner;

public class code327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		
		Scanner input=new Scanner(System.in);
		
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		if(x>=0 && x<=200 && y-100<=(-1.0/2)*x) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
	}

}
