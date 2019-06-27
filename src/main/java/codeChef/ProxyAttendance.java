package codeChef;

/* package codechef; // don't place package name! */
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class ProxyAttendance {
	public static int getMinProxy(String s, int n) {
		if (n == 0)
			return -1;
		int count = 0;
		int present = 0;
		int required = 0;
		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == 'P')
				present++;

		}
		Double per = (double) (present * 100 / n);
		if (75.0 <= per) {
			return -1;
		} else if (4 < n) {
			required = (int) Math.ceil((n * 0.75));
			required = required - present;
			for (int i = 2; i < n - 2; i++) {
				if ((s.charAt(i - 1) == 'P' || s.charAt(i - 2) == 'P')
						&& (s.charAt(i + 1) == 'P' || s.charAt(i + 2) == 'P') && s.charAt(i) == 'A') {
					count++;
				}
			}

		}
		if (required < count)
			return required;
		else
			return -1;
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			String s = sc.next();
			System.out.println(getMinProxy(s, s.length()));
			t--;
		}
	}
}
