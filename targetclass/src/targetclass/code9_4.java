package targetclass;

import java.util.Random;

public class code9_4 {

	public static void main(String[] args) {
		
		Random random=new Random(1000);
		
		for (int i=1;i<=50;i++) {
			if(i%10==0)
				System.out.println(random.nextInt(100));
			else
				System.out.println(random.nextInt(100)+" ");
		}
		
	}

}
