package lab6;
import java.util.Scanner;

public class Average {
	public static void calculate(int a, int b, int c)
	{
		int average =(a+b+c)/3;
		System.out.println(" Average = " + average);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the first number ");
		int l= s.nextInt();
		System.out.println(" Enter the second number ");
		int m= s.nextInt();
		System.out.println(" Enter the third number ");
		int n= s.nextInt();
		calculate(l,m,n);
		
		
	}

}
