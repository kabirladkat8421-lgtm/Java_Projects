package linearsearch;

public class StringSearch {

	public static void main(String[] args) {
		String name = "Rohan";
		char target = 'R';
		int ans = linearsearch2(name, target);
		char str1 = (char) ans;
		System.out.println(str1);
	}

	public static int linearsearch2(String str, char target) {
		if (str.length() == 0) {
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return target;
			}
		}
		return -1;
	}
}
