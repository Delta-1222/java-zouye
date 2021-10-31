package array;
import java.util.Scanner;

public class code7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		Scanner input=new Scanner(System.in);
		int[] n=new int[100];
		
		for(int i=0;i<10;i++) {
			int m=input.nextInt();
			n[m]++;
		}
		
		for(int i=1;i<100;i++) {
			if(n[i]>1) System.out.println(i+" occurs "+n[i]+" times");
			else if(n[i]==1) System.out.println(i+" occurs "+n[i]+" time");
		}
		
	}

}
