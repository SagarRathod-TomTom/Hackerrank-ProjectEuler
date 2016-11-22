import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
				
		System.out.println(strangeCounter(t));
		
	}
	
	static long strangeCounter(long t){
		
		long cycle = 3;
		long index = 1 + cycle;
		
		if( t < index)
			return index - t;
		
		long result = 1;
		
		for(;;){
		  result = (long) (result * 2);
		  cycle = (3 * result);
		  		  
		  if((index + cycle) <= t)
		    index += cycle;
		  else break;
		}
		
		return cycle - (t - index);
		
	}

}
