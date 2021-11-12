package ifwhile5;

public class code5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=10;
		double m=10500;
		double ans1=0,ans2=0;
		while(y>0) {
			ans1+=m;
			m=(1+0.05)*m;
			y--;
		}
		y=4;
		while(y>0) {
			ans2+=m;
			m=(1+0.05)*m;
			y--;
		}
		System.out.println("The tuition fee 10 years later is: "+ans1);
		System.out.println("And after that the tuition fee in 4 years is: "+ans2);
		
	}

}
