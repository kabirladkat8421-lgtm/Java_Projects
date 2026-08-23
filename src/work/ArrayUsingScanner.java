package work;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; // Array of the primitives
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		String[] str = new String[5]; // Array of objects
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		System.out.print(Arrays.deepToString(str));
	}
}
