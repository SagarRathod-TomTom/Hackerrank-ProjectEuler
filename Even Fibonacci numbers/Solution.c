#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    unsigned long int t,n;
    scanf("%ld",&t);
    
    unsigned long int f1,f2,f3;
    unsigned long int esum = 2;
    while(t--)
    {
        scanf("%ld",&n);
        
        f1=1,f2=2,f3= 3;
        esum = 2;
        while(f3 < n)
        {
            if (f3 % 2==0)
                esum+=f3;
            
            f1 = f2;
            f2 = f3;
            
            f3 = f1 + f2;
           
        }
        
        printf("%ld\n",esum);
         
    }
    return 0;
}
