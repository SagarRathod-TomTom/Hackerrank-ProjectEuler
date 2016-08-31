import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isPalindrome(String str)
    {
        char chars[] = str.toCharArray();
        int i=0,j = chars.length - 1;
        while(i < j)
        {
            if(chars[i]!=chars[j])   
                return false;
           i++;j--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        int k = sc.nextInt();
        long sum = 0;
        Long l = new Long(0L);
        while(n-- > 0)
        {
                if(isPalindrome(n+""))
                {                           
                      if(isPalindrome(l.toString(n,k)))
                          sum += n;
                }
        }
        
        System.out.println(sum);
    }
}