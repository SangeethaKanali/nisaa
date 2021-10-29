package c2nodatatypeandoperators;

public class swap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
         int a=6,b=8;
         /*int temp;
         temp=a;
         a=b;
         b=temp;
         System.out.println("a="+a+"\n"+"b="+b);*/
         
         b=b-a;//8-6=2
         a=b+a;//2+6=8
         b=-(b-a);//-(2-8)
         System.out.println("a="+a+"\n"+"b="+b);
	}

}
