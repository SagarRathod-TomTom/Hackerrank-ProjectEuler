import java.math.BigInteger;
import java.util.Scanner;


public class Main {
static long factorials[] = {1,1,2,6,24,120,720,5040,40320,362880};
    
    static long factorialDigitSum(String str)
    {
        int length = str.length();    
        int i = 0;
        long sum = 0;
        int no;
        char ch;
        while(i < length){
            ch = str.charAt(i);
            no = ch - 48;
            sum = sum + factorials[no];          
            i++;
        }
        
        return sum;
    }
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long totalSum =0;
        n--;
        while(n >= 10)
        {
            if(factorialDigitSum(n+"") % n == 0)
            {
                totalSum += n;
            }
            n--;
        }
        
        System.out.println(totalSum);
    }
}
