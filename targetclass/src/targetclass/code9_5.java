package targetclass;

import java.util.GregorianCalendar;

public class code9_5 {

	public static void main(String[] args) {
		
		GregorianCalendar date =new GregorianCalendar();
		
		System.out.println(date.get(date.YEAR)+" "+date.get(date.MONTH)+" "+date.get(date.DAY_OF_MONTH));
		
		date.setTimeInMillis(1234567898765L);
		
		System.out.println(date.get(date.YEAR)+" "+date.get(date.MONTH)+" "+date.get(date.DAY_OF_MONTH));
		
		
	}

}
