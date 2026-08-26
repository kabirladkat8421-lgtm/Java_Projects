package work;
 class ExNestedLoop {

	public static void main(String[] args) {
		int rows=10;
		for (int i = 1; i <= rows; i++) 
		{
			{
		}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 1; a <= rows; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		{
		for (int k = rows; k >= 1; k--) {
			for (int m = 1; m <= k; m++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}
}
/*
  Output:
*
**
***
****
*****
******
*******
********
*********
**********
*****
*****
*****
*****
*****
*****
*****
*****
*****
*****
**********
*********
********
*******
******
*****
****
***
**
*

 */