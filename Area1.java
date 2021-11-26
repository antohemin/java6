package lab6;
import java.util.Scanner;

public class Area1 {
	int l, b;
	public Area1(int l1, int b1)
	{
		l=l1;
		b=b1;
	}
	public int returnArea()
	{
		return (l*b);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the length ");
		int len = s.nextInt();
		System.out.println(" Enter the breadth ");
		int br = s.nextInt();
		Area1 a = new Area1(len,br);
		System.out.println( " Area "+ a.returnArea());
		
	}

}
