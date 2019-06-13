package HackerRank;

public class BreakingRecords {
	static int[] breakingRecords(int[] scores) {
		int result[] = new int[2];

		int minScore = scores[0];
		int maxCount = 0;
		int minCount = 0;
		int maxScore = scores[0];

		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < minScore) {
				minScore = scores[i];
				minCount++;
			}
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxCount++;
			}

		}

		result[1] = minCount;
		result[0] = maxCount;
		return result;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		int res[] = breakingRecords(arr);
		System.out.println(res[0] + " " + res[1]);

	}

}
