package HackerRank;

public class BirthDayCake {
	
	 // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	int count=0;
    	int max=0;
    	for(int i=0;i<ar.length;i++) {
    		if(max==ar[i]) {
    			count++;
    			
    		}
    		else if(max<ar[i]) {
    			count=1;
    			max=ar[i];
    		}
    	}
    	
    	return count;

    }
	
	public static void main(String[] args) {
		int arr[]=new int[]{3,2,4,3};
		
		System.out.println(birthdayCakeCandles(arr));
	}

}
