package c2nodatatypeandoperators;

public class sum_digit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int f,s,t,four,fifth,sum;
		int n=12345;
		//int n=5696;
		f=(n/10000)+2;
		n=n%10000;
		System.out.print(f);
		
		s=(n/1000)+2;
		n=n%1000;
		System.out.print(s);
		
		t=(n/100)+2;
		n=n%100;
		System.out.print(t);
		
		four=(n/10)+2;
		System.out.print(four);
		
		fifth=(n%1)+2;
		System.out.print(fifth);
		
		
		
		//sum=f+four;
		//System.out.print(sum);
		
		
		

	}

}
