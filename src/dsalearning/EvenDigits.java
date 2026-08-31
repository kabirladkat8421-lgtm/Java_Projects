package dsalearning;

public class EvenDigits {

	public static void main(String[] args) {
	int[][]arr= {
			{10,20,30},
			{5,5,5}
			};
for(int[]a :arr)
{
	int sum=0;
	for(int b:a)
	{
		sum+=b;
	}
	System.out.println(sum);
}

	}

}
