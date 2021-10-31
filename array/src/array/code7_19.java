package array;

import java.util.Scanner;

public class code7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter th size of the list: ");
		int n=input.nextInt();
		
		System.out.print("Enter the contents of the list: ");
		int[] m=new int[n+1];
		boolean flag1=true;
		boolean flag2=true;
		
		for(int i=0;i<n;i++) {
			m[i]=input.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(m[i]>m[i+1]) flag1=false;
		}
		for(int i=0;i<n-1;i++) {
			if(m[i]<m[i+1]) flag2=false;
		}
		
		System.out.print("The list has "+n+" integers");
		for(int i=0;i<n;i++) {
			System.out.print(" "+m[i]);
		}
		System.out.print("\n");
		if(flag1||flag2) System.out.println("The list is already sorted");
		else System.out.println("The list is not sorted");
		
		
	}

}
