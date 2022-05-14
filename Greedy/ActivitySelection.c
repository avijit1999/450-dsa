#include <stdio.h>
void ActivitySelection(int s[],int f[],int n);
int main() {
    // Write C code here
    int n;
    printf("Enter the number of time interval:");
    scanf("%d",&n);
    int s[n],f[n];
    printf("Enter the starting and ending time:");
    for(int i=0;i<n;i++){
        scanf("%d %d",&s[i],&f[i]);
    }
    printf("\n");
    ActivitySelection(s,f,n);
    return 0;
}
void ActivitySelection(int s[],int f[],int n){
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(f[i]>f[j])
            {
                int t;
                t=s[i];
                s[i]=s[j];
                s[j]=t;
                t=f[i];
                f[i]=f[j];
                f[j]=t;
            }
        }
    }
    printf("\nSorted Array:\n");
    for(int i=0;i<n;i++){
        printf("\n%d %d",s[i],f[i]);
    }
    int x[n];
    for(int i=0;i<n;i++){
        x[i]=-1;
    }
    int c=1,i=0,j=1;
    x[0]=0;
   for(;j<n;j++)
   {
       if(f[i]<=s[j])
       {
           x[c++]=j;
           i++;
       }
   }
   printf("\nThe selected time is:");
   for(int i=0;i<c;i++){
        printf("(%d %d) ",s[x[i]],f[x[i]]);
    }
}
