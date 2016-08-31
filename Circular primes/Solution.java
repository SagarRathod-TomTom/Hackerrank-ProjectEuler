import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static boolean isPrime(long n) {
        
    if (n <= 3) {
        return n > 1;
    }
 
    if (n % 2 == 0 || n % 3 == 0) {
        return false;
    }
 
    long i;
    for ( i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
 
    return true;
}
    
    static boolean isCircularPrime(String str)
    {
        Long no = new Long(str);
        
        if(!isPrime(no))
         return false;    
        
        int shifts = str.length() - 1;
        
        int i = 0;
        String ch;
        
        while(i < shifts)
        {
            ch = str.charAt(0) + "";
            
            str = str.substring(1) + ch ;
            
            no = new Long(str);
            
            if(!isPrime(no))
             return false;
            
            i++;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
        
        long totalSum = 0;
        String no;
        
        while(n-- > 0)
        {
            if(isCircularPrime(n+""))    
            totalSum += n;
        }
        
        System.out.println(totalSum);
        
    }
}