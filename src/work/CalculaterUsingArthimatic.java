package work;

import java.util.Scanner;

public class CalculaterUsingArthimatic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input 1 ");
		int input1 = sc.nextInt();
		String symbol = "|<<<<<<<<<<<<<<<<<<<<<|\n" + "|1.Addtiion(+)        |\n" + "|2.Substraction(-)    |\n"
				+ "|3.Divsion(/)         |\n" + "|4.Multiplication(*)  |\n" + "|5.Remider(%)         |\n"
				+ ">>>>>>>>>>>>>>>>>>>>>>>";
		System.out.println(symbol);
		System.out.print("Enter the operation : ");
		String arthimatic = sc.next();
		System.out.print("Enter the input 2 : ");
		int input2 = sc.nextInt();
		{
			if (arthimatic.equals("+")) {
				int addtion = input1 + input2;
				System.out.println("______________________");
				System.out.print("Result : " + addtion);
			} else {
				if (arthimatic.equals("-")) {
					int substraction = input1 - input2;
					System.out.println("______________________");
					System.out.print("Result : " + substraction);
				} else {
					if (arthimatic.equals("*")) {
						int multiplication = input1 * input2;
						System.out.println("______________________");
						System.out.print("Result : " + multiplication);
					} else {
						if (arthimatic.equals("/")) {
							int division = input1 / input2;
							System.out.println("______________________");
							System.out.print("Result : " + division);
						} else {
							if (arthimatic.equals("%")) {
								int reminder = input1 % input2;
								System.out.println("______________________");
								System.out.print("Result : " + reminder);
							} else {
								System.out.print("Entered the invalid operation please try again");
							}
						}
						sc.close();
					}
				}
			}

		}
	}

}
