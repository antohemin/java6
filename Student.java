package lab6;

public class Student {
	String name;
	int roll_no;
	
	Student()
	{
		name = "John";
		roll_no=2;
	}
	public static void main(String[] args)
	{
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.roll_no);
		
	}

}
