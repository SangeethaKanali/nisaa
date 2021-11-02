package userinput;

import java.util.Scanner;

public class square {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double area;
		while(true)
		{
			int side1=sc.nextInt();
			//int side2=sc.nextInt();
			area=side1*side1;
			double peri=4*side1;
			System.out.println(area);
			System.out.println(peri);
		}

	}

}
