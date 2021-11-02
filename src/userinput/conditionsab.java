package userinput;

import java.util.Scanner;

public class conditionsab {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<50&&a<b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println(false);
		}
		}
		
		

	}

}
