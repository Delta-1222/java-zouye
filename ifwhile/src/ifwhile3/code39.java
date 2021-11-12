package ifwhile3;
import java.util.Scanner;

public class code39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String str = input.next();
		
		int ans = 0;
		for(int i=0;i<9;i++)
		{
			ans += (int)(str.charAt(i)-'0') * (i+1);
		}
		ans = ans % 11;
		
		if(ans == 10)
		{
			System.out.println("The ISBN-10 number is " + str + "X");
		}
		else
		{
			System.out.println("The ISBN-10 number is " + str + ans );
		}
		
		
		

	}

}
