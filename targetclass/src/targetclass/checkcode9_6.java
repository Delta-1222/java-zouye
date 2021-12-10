package targetclass;

public class checkcode9_6 {

	public static void main(String[] args) {
		
		int[] n = new int[100000];
		for (int i=0;i<100000;i++) {
			n[i]=(int) (Math.random()*100);
		}
		
		StopWatch date = new StopWatch();
		
		selectionSort(n);
		
		date.Stop(date.getElapsedTime());
		
		long executeTime=date.getEndTime()-date.getStartTime();
		
		System.out.println("runtime is: " + executeTime + "milliseonds.");

	}
	
	public static void selectionSort(int[] list) {
		for(int i=0;i<list.length-1;i++) {
			int currentMax=list[i];
			int currentMaxIndex=i;
			
			for(int j=i+1;j<list.length;j++) {
				if(currentMax<list[i]) {
					currentMax=list[j];
					currentMaxIndex=j;
				}
			}
			
			if(currentMaxIndex != 1) {
				list[currentMaxIndex]=list[i];
				list[i]=currentMax;
			}
		}
		
		for(int i1=0;i1<list.length;i1++) {
			System.out.println(" "+list[i1]);
		}
		
	}

}
