package userinput;

import java.util.Scanner;

public class squarenum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int a=sc.nextInt();
			double square=a*a;
			System.out.println(square);
		}

	}

}
