package lab6;

public class Rectangle {
	
	int l1=4,b1=5,l2=5,b2=8;
	
	public int area(int l, int b)
	{
		int area = l*b;
		return area;
	}
	
	
	
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		System.out.println(" Area 1 = "+ r.area(r.l1, r.b1));
		System.out.println(" Area 2 = " +r.area(r.l2, r.b2));
	}
}
