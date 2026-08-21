package work;

import java.util.Scanner;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num)
    {
        if (num <=1){

        return false;
        }
        int c = 2;
        while(c*c<=num)
        {
            if(num%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>num;
    }
}