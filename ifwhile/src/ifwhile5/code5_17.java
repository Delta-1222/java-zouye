package ifwhile5;
import java.util.Scanner;

public class code5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k>0;k--) {
				if(k==i) System.out.print(k);
				else System.out.print(" "+k);
			}
			for(int p=2;p<=i;p++) {
				System.out.print(" "+p);
			}
			System.out.print('\n');
		}

	}

}
