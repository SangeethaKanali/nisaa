package userinput;

import java.util.Scanner;

public class robertmarks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			int s3=sc.nextInt();
			if((s1&s2&s3)<100)
			{
				double total=s1+s2+s3;
				double per=total/300*100;
				System.out.printf(total+"\n"+"%.2f",per);
				
			}
			
				
			
		}

	}

}
