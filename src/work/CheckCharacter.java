package work;

import java.util.Scanner;


public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("It's Lowercase");
		}
		else
		{
			System.out.println("It's Uppercase");
		}
		System.out.println(ch);
	}
	

}