import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static int indexOf(String names[],String keyword){
	      
		int min  = 0 , max = names.length - 1;
	    
		int mid = (min + max)  / 2;
		
		 while(min <= max)
		 {
			 if(names[mid].equals(keyword))
			 return mid;
			 else
			 if(keyword.compareTo(names[mid]) > 0)
				 min = mid + 1;
			 else
				 max = mid - 1;
			 
			 mid = (min + max)  / 2;
		 }
	       
		 return -1;
    }
    
    	static int worth(String name)
	   {
		int value = 0;
		char str[] = name.toCharArray();
		
		int i = 0;
		char ch;
		
		while(i < str.length)
		{
			
			value = value +  (int) str[i] - 64;
			i++;
		}
		
		return value;
		
	}
    
    public static void main(String[] args) {
   
            Set<String> set = new TreeSet<String>();
            
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
        
            while(n-- > 0){
                
                set.add(sc.next());
            }
        
           String names[]= new String[set.size()];
		   set.toArray(names);
        
            int q = sc.nextInt();
            String name;
            int index;
        
            while(q-- > 0){
                
                name = sc.next();
               index = indexOf(names,name) + 1;
               System.out.println(index * worth(name));
            }
        
            sc.close();
        
    
    }
}