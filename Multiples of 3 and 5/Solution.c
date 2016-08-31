#include <stdio.h>

int main() {

    unsigned long int t,n,sum3,sum5,sum;
    scanf("%ld",&t);
    
    while(t--){
        
        scanf("%ld",&n);
        
        sum = 0;
        n--;
        sum3 = n / 3;
        sum3 = (sum3 * (sum3+1) / 2) * 3;
        
        sum5 = n / 5;
        sum5 = (sum5 * (sum5+1) / 2) * 5;
       
        sum  = n / 15;        
        sum  = (sum * (sum + 1) / 2) * 15;
        
        printf("%ld\n",sum3+sum5 - sum);
    }
        
    return 0;
}
