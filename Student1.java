package lab6;
import java.util.*;

public class Student1 {
	String name;
	int roll_no;
	int ph_no;
	String address;
	public static void main(String[] args)
	{
		Student1 a = new Student1();
		Student1 b = new Student1();
		a.name = "Sam";
		a.roll_no=1;
		a.ph_no=999999999;
		a.address="XXXX,YYYYY,ZZZZ-9999";
		b.name="John";
		b.roll_no=99;
		b.ph_no=888888888;
		b.address="YYYYY,DDDDDD-00000";
		System.out.println(" Name : " +a.name +", PH NO : "+a.ph_no + ", Roll NO : "+ a.roll_no + ", Address : " +a.address);
		System.out.println(" Name : " +b.name +", PH NO : "+b.ph_no + ", Roll NO : "+ b.roll_no + ", Address : " +b.address);
	}

}
