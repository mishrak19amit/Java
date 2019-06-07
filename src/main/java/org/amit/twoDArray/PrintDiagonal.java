package org.amit.twoDArray;

public class PrintDiagonal {

	static void diagonalPrint(int[][] arr) {
		int x = arr[0].length;
		int y = arr.length;
		int i = 0;
		int j = 0;
		System.out.print(arr[i][i] + " ");
		while (i != x && j != y) {
			// Going right or down
			if (j < y - 1) {
				j = j + 1;
				System.out.print(arr[i][j] + " ");
			} else {
				i = i + 1;
				if (x <= i)
					break;
				System.out.print(arr[i][j] + " ");
			}

			int l = 0;
			int m = 0;
			// going down
			for (l = i + 1; l <= j; l++) {
				for (m = j - 1; i <= m; m--) {
					System.out.print(arr[l][m] + " ");
					l++;
				}
			}

			// going down or right
			if (j < x - 1) {
				i = j + 1;
				j = m + 1;
				System.out.print(arr[i][j] + " ");
			} else {
				i = j;
				j = m + 2;
				System.out.print(arr[i][j] + " ");

			}

			// going up
			for (l = i - 1; j <= l; l--) {
				for (m = j + 1; m <= i; m++) {
					System.out.print(arr[l][m] + " ");
					l--;
				}
			}

			// swapping i and j here
			int temp = i;
			i = j;
			j = temp;

		}

	}

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = k;
				k++;
			}

		}

		diagonalPrint(arr);
	}

}
