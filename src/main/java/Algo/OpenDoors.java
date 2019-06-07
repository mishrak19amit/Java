package Algo;

import java.util.Scanner;

class OpenDoors {
	public static void main(String[] args) {
		// code

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (0 < t--) {
			int p = sc.nextInt();
			int fres = 0;
			for (int i = 1; i <= p; i++) {
				if(getopened(i))
                 fres++;
			
				}

			System.out.println(fres);
		}
		sc.close();
	}
	
	public static boolean getopened(int i)
	{   int count=1;
		for (int j = 2; j <= i/2; j++) {
			if(i%j==0)
				count++;
		}
		if(i!=1)
		count++;
		if(count%2==0)
		return false;
		else
		return	true;
		
	}
}