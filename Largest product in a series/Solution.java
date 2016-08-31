import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long digitProduct(long no){
        
        long ans = 1;
        int rem;
        
        while(no!=0){
            
            rem = (int)(no % 10);
            no = no / 10;
            
            ans = ans * rem;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        
        int t,k,n;
        
        Scanner sc = new Scanner(System.in);
        
        t = sc.nextInt();
        
        long ans,p;
        String  no,temp;
        
        int i,j;
            
        while(t-- > 0){
            
            n = sc.nextInt();
            k = sc.nextInt();
            
            ans = -1;
            no = sc.next();
                        
            i = 0;
            j = k;
            
            while( j < n)
            {
                
                temp = no.substring(i,j);
                
                p = digitProduct(Long.parseLong(temp));
                
                if(p > ans)
                    ans = p;
                
                i++;
                
                j++;
                
            }
            
            System.out.println(ans);
            
        }
        
    }
}