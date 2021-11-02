package userinput;

import java.util.Scanner;

public class rollno {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
			{
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("enter the rollno");
			String rollno=sc.nextLine();
			System.out.println("enter the interest");
			String interest=sc.nextLine();
			System.out.println("Hey,my name is "+name+" and my roll number is "+rollno+" and my interest is "+interest);
			}

	}

}
