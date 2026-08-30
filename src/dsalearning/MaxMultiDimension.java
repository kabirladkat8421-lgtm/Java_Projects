package dsalearning;

public class MaxMultiDimension {
	public static void main(String[] args) {
		int[][] arr = { { 55, 20, 30 }, { 50, 66, 52 }, { 44, 144, 30 } };

		System.out.println(max(arr));
	}

	public static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
				}
			
			}
		
		}
		return max;
	}
}
