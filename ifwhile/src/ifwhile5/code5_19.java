package ifwhile5;

public class code5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=8;i++) {
			for(int j=0;j<8-i;j++) {
				System.out.print("    ");
			}
			for(int k=0;k<i;k++) {
				if(k==0) System.out.print((int)Math.pow(2, k));
				else System.out.printf("%4d",(int)Math.pow(2, k));
			}
			for(int p=i-2;p>=0;p--) {
				System.out.printf("%4d",(int)Math.pow(2, p));
			}
			System.out.print('\n');
		}

	}

}
