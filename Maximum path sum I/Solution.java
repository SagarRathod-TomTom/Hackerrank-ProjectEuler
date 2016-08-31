import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

	     static  int maxPath(int noOfRows,int arr[],int currRow,int currCol, int maxPath)
	        {
	    	 
	    	 	  if(currRow > noOfRows)
	    	 		  return maxPath;
	    	 	  
	    	 		int sum = 0;
	    	       	 		
	    	 		sum = maxPath + arr[currCol];
	    	 		
	    	  	  int leftSum =  maxPath(noOfRows,arr,currRow+1,currCol+currRow,sum);
	    	 		
	    	       int rightSum = maxPath(noOfRows,arr,currRow+1,currCol+currRow+1,sum);
	    	 	   
	    	    	return leftSum > rightSum ? leftSum : rightSum;
	            
	        }  
	              
	    public static void main(String args[])
	       {
	          Scanner sc = new Scanner(System.in);
	          
	          int t= sc.nextInt();
	          int n,elements;  
	          int arr[];
	          while(t-- > 0)
	          {
	             n = sc.nextInt();
	             elements = n * (n + 1)  / 2;
	             
	             arr = new int[elements];
	            
	              for(int i = 0; i < elements;i++)
	                 arr[i] = sc.nextInt();
	             
	              System.out.println(maxPath(n,arr,1,0,0));
	             
	          }
	           
	           
	    }
	       
}


