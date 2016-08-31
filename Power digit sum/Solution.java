
import java.util.Scanner;

import java.math.BigInteger;

public class Solution {

static BigInteger zero = new BigInteger("0");
	static BigInteger one = new BigInteger("1");
	static BigInteger two = new BigInteger("2");
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
		
		int t;
		
	    BigInteger n, p;
	   
	    Scanner sc = new Scanner(System.in);
	    
	    t = sc.nextInt();
	    
	    
	    while(t-- > 0){
	        
	        n = sc.nextBigInteger();
	        
	        if(n.equals(zero))
	        System.out.println(1);
	        else
	        if(n.equals(one))
		        System.out.println(2);
	        else
	        {
	        p=new BigInteger("2");
	        n = n.subtract(one);
	        for(;!n.equals(zero);)
	        {
	            p = p.multiply(two);
	            n = n.subtract(one);
	        }
	        
	        System.out.println(digitSum(p));
	        p=null;
	        }
	    }
	   
	    sc.close();
		
	}}