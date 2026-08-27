package work;

public class FindElementArray {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 50, 20, 60, 80, 90, 100 };
		int target = 60;
		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				System.out.println("Found the at index : " + i);
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("Element not found ");
		}
	}
}