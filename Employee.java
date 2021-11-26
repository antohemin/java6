package lab6;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args)
	{
		String[] name= {"Robert","Sam","John"};
		int[] year = { 1994, 2000, 1999};
		String[] Address= {"64C- Wall Street","68D- Walls Street","26B- Walls Street"};
		System.out.println("Name\t\t"+ "Year of Joining \t"+ "Address");
		for(int i=0;i<=2;i++)
			System.out.println(name[i]+" \t\t"+ year[i]+" \t\t\t"+ Address[i]);
		
	}

}
