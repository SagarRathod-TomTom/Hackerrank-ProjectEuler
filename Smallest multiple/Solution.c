#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int isPrime(unsigned long n) {
    if (n <= 3) {
        return n > 1;
    }
 
    if (n % 2 == 0 || n % 3 == 0) {
        return 0;
    }
 
    unsigned long i;
    for ( i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return 0;
        }
    }
 
    return 1;
}


int atLeastTwo(int arr[],int n,int no)
{
    int count =0,i;
    
    for(i=0;i<n;i++)
        if(arr[i] % no == 0)
        {
          count++;
          if(count >=2)
              return 1;
        }
   
    return 0;
}

int main() {

    int t,n,j,i;
    scanf("%d",&t);
    
    unsigned long int ans;
    
    while(t--){
        
       scanf("%d",&n);
        
       int arr[n];
       
        for(j = 0 ; j < n ; j++)
             arr[j] = j + 1;
        
        ans = 1;
        i = 2;
        
        while(atLeastTwo(arr,n,i))
        {
            
            ans = ans * i;
                    
            for(j = 0 ; j < n ; j++)  
                if(arr[j] % i == 0)
                    arr[j] = arr[j] / i;
           
               if(!atLeastTwo(arr,n,i))
                { 
                    i++;
                    while(!isPrime(i))
                    i++;
            }
        }
        
         for(j = 0 ; j < n ; j++)
             ans = ans * arr[j];
        
        printf("%ld\n", ans);
    }
    return 0;
}
