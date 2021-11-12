package ifwhile3;
import java.util.Scanner;

public class code319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter three edges: ");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		if(a+b>c && a+c>b && b+c>a)
		{
			System.out.println("The perimete of this traingle is: "+ (a+b+c));
		}
		else
		{
			System.out.println("The numbers is unlegal");
		}
		
	}

}
