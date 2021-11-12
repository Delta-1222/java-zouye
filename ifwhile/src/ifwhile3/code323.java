package ifwhile3;

import java.util.Scanner;

public class code323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter point with two coordinates£»");
		int x=input.nextInt();
		int y=input.nextInt();
		
		if(Math.abs(x)>5 || Math.abs(y)>2.5) {
			System.out.printf("Point ("+"%.1f %.1f"+") is not in the rectangle",x/1.0,y/1.0);
		}
		else {
			System.out.printf("Point ("+"%.1f %.1f"+") is in the rectangle",x/1.0,y/1.0);
		}
		
	}

}
