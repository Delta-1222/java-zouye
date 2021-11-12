package ifwhile3;

import java.util.Scanner;

public class code322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		int x=input.nextInt();
		int y=input.nextInt();
		
		if (Math.sqrt(x*x+y*y)<=10) {
			System.out.printf("Point ("+"%.1f %.1f"+") is in the circle",x/1.0,y/1.0);
			
		}
		else {
			System.out.printf("Point ("+"%.1f %.1f"+") is not in the circle",x/1.0,y/1.0);
		}
		
		

	}

}
