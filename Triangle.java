package lab6;
import java.util.*;

public class Triangle {
	int l=3,b=4,h=5;
	public static void main(String[] args)
	{
		Triangle obj = new Triangle();
		int a=(obj.b+obj.h)/2;
		int p =obj.l+obj.b+obj.h;
		System.out.println(" Area = "+a);
		System.out.println(" Perimeter = " +p);
	}
}