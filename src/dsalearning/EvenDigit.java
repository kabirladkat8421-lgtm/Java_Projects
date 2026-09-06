package dsalearning;

public class EvenDigit {

	public static void main(String[] args) {
		int[] arr = { 122, 22, 33, 88, 1254 };

		System.out.println(numFinder(arr));// method being calling.

	}

	public static int numFinder(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {// after number checking it's true count++ will be increased
				count++;
			}

		}
		return count;// it will return the total number count or we can also say numbers of even come
						// in array total count that will return;
	}

	static boolean even(int num) {
		int NumberOfDigitinNum = digit(num);// total number of count will be passed digit because it's returning count;
		if (NumberOfDigitinNum % 2 == 0) {// NumberOfdigitInNum(count)%2 will return it's remainder and it will check if
											// it's 0 then it even but remainder is 1 it will return false that's means
											// it's odd
			return true; // if it's true execution contineu and it will go to numFinder, but it's false
							// execution stop.
		}
		return false;
	}

	static int digit(int num) {
		if (num < 0)// if the array value is in minus it will turn negative value into the positive
		{
			num = num * -1;
		}
		if (num == 0)// check num is zero then zero can be the digit then it will return 1.
		{
			return 1;
		}
		int count = 0;
		while (num > 0) { // loop will run until num will be zero
			count++; // Every time loop runs count will be increased
			num = num / 10; // Number being decreased by one digit
		}
		return count; // Returing total digit in num;
	}
}
