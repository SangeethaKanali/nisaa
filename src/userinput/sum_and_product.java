package userinput;

import java.util.Scanner;

public class sum_and_product {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum,product;
		Scanner sc=new Scanner(System.in);
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		sum=aa+bb;
		product=aa*bb;
		System.out.println("sum="+sum+" product="+product);

	}

}
