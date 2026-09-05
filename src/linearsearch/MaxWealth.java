package linearsearch;

public class MaxWealth {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 5, 5, 5 } };
		System.out.println(maxiumWealth(arr));
	}

	static int maxiumWealth(int[][] account) {
		int ans = Integer.MIN_VALUE;
		for (int[] person : account) {

			int sum = 0;
			for (int anInt : person) {
				sum = sum + anInt;
			}
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;

	}

}
