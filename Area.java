package lab6;
import java.util.Scanner;


public class Area {
	int ln, br;
	public void setDim(int l, int b)
	{
		ln=l;
		br=b;
	}
	public int Area()
	{
		return (ln*br);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the length ");
		int a= s.nextInt();
		System.out.println(" Enter the breadth ");
		int b = s.nextInt();
		Area r = new Area();
		r.setDim(a, b);
		System.out.println(" Area = " + r.Area() );
		
	}
	

}
