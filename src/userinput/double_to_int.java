package userinput;

import java.util.Scanner;

public class double_to_int {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double area;
		while(true)
		{
		double breadth=sc.nextDouble();
		double length=sc.nextDouble();
		area=length*breadth;
		
		System.out.println((int)area);

		
			
		
		}
		
	}

}
