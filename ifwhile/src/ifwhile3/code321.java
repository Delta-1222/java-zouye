package ifwhile3;

import java.util.Scanner;

public class code321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] x= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2012): ");
		int y=input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int m=input.nextInt();
		
		System.out.print("Enter the day of the month 1-31: ");
		int q=input.nextInt();
		
		if(m<=2) y+=2;
		
		int j=(int)y/100;
		int k=y%100;
		
		int h=((q+(26*(m+1))/10)+k+k/4+j/4+5*j)%7;
		
		System.out.println("Day of the week is "+ x[h]);
		
		
		
		

	}

}
