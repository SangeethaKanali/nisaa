package c2nodatatypeandoperators;

public class add2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 5696;
	    //      output is 7818
	    // ---------Java-----------
	    // --------solution--------



	    int first  = a/1000+2;
	    
	    int b = a%1000;
	    int second = b/100+2;
	    
	    int c = b%100;
	    int d = c/10+2;
	    int third = d/10;
	    
	    int e = c%10;
	    int fourth = e+2;
	    
	    String result = Integer.toString(first)+Integer.toString(second)+Integer.toString(third)+Integer.toString(fourth);
	            
	    System.out.println(result);
	

	}

}
