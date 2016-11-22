import java.util.Scanner;



public class Solution {

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	
    	double problems;
    	int no_of_pages = 0;
    	int curr_page_no = 1;
    	int special_problems = 0;
    	for(int i=0;i < n; i++){
    		
    			problems = sc.nextInt();
    			no_of_pages = (int) Math.ceil(problems/k);
    			int m;
    			boolean flag = true;
    				for(m = 1; m <= problems;m++){
    					
    					//System.out.println("current page no:"+curr_page_no  + " m:"+ m);
    					
    					if(m==curr_page_no)
    						special_problems++;
    					
    					if(m%k==0){
    						curr_page_no++;
    						flag = false;
    					}
    					else flag = true;
    				}
    				
    				if(flag)
    				curr_page_no++;
    			}
    
    	System.out.println(special_problems);
    }
}