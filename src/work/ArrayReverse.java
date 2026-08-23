package work;

import java.util.Arrays;

import work.ArraySwap;

public class ArrayReverse {
	static ArraySwap as = new ArraySwap();

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 60 };
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			as.swap(arr, start, end);
			{
				start++;
				end--;
			}
		}
	}
}