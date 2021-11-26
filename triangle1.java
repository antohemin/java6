package lab6;

public class triangle1 {
	int l,b,h;
	public triangle1(int l1, int b1, int h1)
	{
		l=l1;
		b=b1;
		h=h1;
	}
	public static void main(String[] args)
	{
		triangle1 t= new triangle1(3,4,5);
		int area = (t.b*t.h)/2;
		int perimeter =(t.b+t.h+t.l);
		System.out.println(" Area = "+area);
		System.out.println(" Perimeter = "+ perimeter);
		
	}
}
