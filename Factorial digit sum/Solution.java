import java.util.Scanner;
import java.math.*;

public class Solution {

     static BigInteger zero = new BigInteger("0");
	static BigInteger ten = new BigInteger("10");

	static BigInteger digitSum(BigInteger no)
	{
	    BigInteger rem;
		BigInteger sum = new BigInteger("0");
	    
	    while(no.compareTo(zero)!=0)
	    {
	        rem = no.mod(ten);
	        no  = no.divide(ten);
	        sum = sum.add(rem);
	    }
	    
	    return sum;
	}
	
	
	public static void main(String[] args) {
		
		int t,n,i;
	    BigInteger p;
	   
	    Scanner sc = new Scanner(System.in);
	    
	    t = sc.nextInt();
	    
	    
	    while(t-- > 0){
	        
	        n = sc.nextInt();
	         p=new BigInteger("1");
	        
	        for(i=2; i <= n;i++)
	            p = p.multiply(new BigInteger(""+i));
	        
	        System.out.println(digitSum(p));
	        p=null; 
	    }
	   
	    sc.close();
		
	}}