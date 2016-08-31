import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    static boolean isPalindrome(String s){
        
        char str[] = s.toCharArray();
        int i = 0, j = str.length - 1;
        
        while(i < j){

            if(str[i]!=str[j])
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        int t,n;
        String temp;
        
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        
        int currNo,i,j;
        boolean flag;
        while(t-- > 0)
        {
               
                n = sc.nextInt();
                
                currNo = n - 1;
                flag = true;
            
                do
                 {
                     while(!isPalindrome(currNo+""))
                     currNo--;
                
                    for(i=101; i < 1000 && flag;i++)
                        for(j=101;j < 1000 && flag;j++)
                                if(i*j == currNo)
                                  flag = false;  
                        
                        if(flag)
                        currNo--;
                        
                }while(flag);
            
            System.out.println(currNo);
            
        }
        
    }
}