#include <stdio.h>

int main() {

    int grid[20][20];
     int i,j;
    
    for(i=0;i < 20;i++)
     for(j=0;j< 20 ;j++)
        scanf("%d",&grid[i][j]);
    
      unsigned long int ans=0,p = 0;
        
    for(i=0;i < 20;i++)
     for(j=0;j < 20 ;j++)
       {
            //right
            if( j+3 < 20)
            {
                p = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
            }
        
            if(p > ans)
             ans = p;
        
            //left
            if( j - 3 > -1)
            {
                p = grid[i][j] * grid[i][j-1] * grid[i][j-2] * grid[i][j-3];
            }
        
            if(p > ans)
             ans = p;
            
            //down
            if( i+3 < 20)
            {
                p = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
            }
        
            if(p > ans)
             ans = p;
            
            //up
            if( i-3 > -1)
            {
                p = grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j];
            }
        
            if(p > ans)
             ans = p;
        
            //rigth-down
            if( i+3 < 20 && j+3 < 20)
            {
                p = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
            }
        
            if(p > ans)
             ans = p;
        
            //down-left
            if( i+3 < 20 && j-3 > -1)
            {
                p = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
            }
        
            if(p > ans)
             ans = p;
        
            //left-up
            if( i-3 > -1 && j-3 > 0)
            {
                p = grid[i][j] * grid[i-1][j-1] * grid[i-2][j-2] * grid[i-3][j-3];
            }
        
            if(p > ans)
             ans = p;
        
            //up - right
            if( i-3 > -1 && j+3 < 20)
            {
                p = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
            }
        
            if(p > ans)
             ans = p;
        
        
        //  printf("-%ld- ",ans);
        
       }
    
    
    printf("%ld",ans);
    
     
    
    return 0;
}
