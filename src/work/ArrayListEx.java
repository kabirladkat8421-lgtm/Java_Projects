package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	ArrayList<Integer>list=new ArrayList<>(10);
//list.add(12);
//list.add(20);
//list.add(300);
//list.add(53);
//list.add(77);`
	for(int i = 0;i<5;i++)
	{
		list.add(sc.nextInt());
	}
for(int i = 0;i<5;i++)
{
	System.out.println(list.get(i));
}
//System.out.println(list.contains(53));
//System.out.println(list.size());
//list.sort(null);
//list.set(0, 1);
//System.out.println(list);
	}
}
