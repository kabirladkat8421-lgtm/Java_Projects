package linearsearch;

public class LinearExample {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 60, 70, 80, 90, 100 };
	int target = 60; //It's Shadowing the target
	int ans = linearsearch(arr, target);
		System.out.println(ans);

}

static int linearsearch(int[] arr, int target) {
	if (arr.length == 0) {
		return -1;
	}
	for (int index = 0; index < arr.length; index++) {
		int element = arr[index];
		if (element == target) {
			return index;
		}
	}
	return -1;

}
}
