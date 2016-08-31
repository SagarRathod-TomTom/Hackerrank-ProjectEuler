#include <stdio.h>
#include <math.h>

int main() {

    unsigned long int t,n,sum,sqsum;
    scanf("%ld",&t);
    
    while(t--) {

        scanf("%ld",&n);
        
        sum = n * (n+1) / 2;
        sum = sum * sum;
        
        sqsum = n * (n+1) * ( 2*n + 1) / 6;
        
        printf("%ld\n",sum - sqsum);
        
    }
       
    return 0;
}
