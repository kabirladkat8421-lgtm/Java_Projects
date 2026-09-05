package linearsearch;

public class FindMinNum {

	public static void main(String[] args) {
		int[] arr = { -8,15,22,63,54,5};
		System.out.println(min(arr));
	}

	public static int min(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int ans = arr[0]; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans)
			{
				ans = arr[i]; 
			}
		}
		return ans;
	}
}
