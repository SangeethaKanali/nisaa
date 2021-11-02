package userinput;

import java.util.Scanner;

public class equal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		if(a.equals(b)&&b.equals(c)&&c.equals(a))
		{
			System.out.println("yeah");
		}
		else if(a.equals(b)||b.equals(c)||c.equals(a))
		{
			System.out.println("yes 2");
		}
		else
		{
			System.out.println("nothing");
		}
		}

	}

}
