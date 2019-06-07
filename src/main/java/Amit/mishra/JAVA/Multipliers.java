package Amit.mishra.JAVA;

public class Multipliers {

	public static void main(String[] args) {
		int arr[] = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int k = 36;
		System.out.println("Array element is below: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Value of K : " + k + "\n");
		getmultipliers(arr, k);
	}

	static void getmultipliers(int arr[], int k) {
		for (int i = 0; i < arr.length; i++) {
			int d = arr[i];
			int n = k;

			if (n % d == 0) {
				n = n / d;
				if (searchnext(arr, n)) {
					System.out.println("Pair value (" + d + "," + n + ")");

				}
			}
		}
	}

	static boolean searchnext(int arr[], int n) {

		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i])
				return true;
		}
		return false;

	}
}