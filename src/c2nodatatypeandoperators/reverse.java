package c2nodatatypeandoperators;

public class reverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,fi,se,thi,rev;
		n=123;
		fi=n/100;
		n=n%100;
		
		se=n/10;
		thi=n%10;
		rev=thi*100+se*10+fi;
		System.out.println(rev);

	}

}
