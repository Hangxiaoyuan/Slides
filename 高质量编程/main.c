#include <stdio.h>
#include <stdlib.h>
#define MAX_N 15

int get_n()
{
    int n;
    scanf("%d",&n);
    return n;
}
void output_p(int p[],int n)
{
    int i;
    for (i=1;i<=n;++i)
    {
        printf("%d ",p[i]);
    }
    putchar('\n');
}
void gen(int p[],int use[],int k,int n)
{
    int i;
    if (k==n)
    {
        for (i=1;i<=n;++i)
        {
            if (use[i]==0)
            {
                use[i]=1;
                p[k]=i;
                output_p(p,n);
                use[i]=0;
            }
        }
    }
    else
    {
        for (i=1;i<=n;++i)
        {
            if (use[i]==0)
            {
                use[i]=1;
                p[k]=i;
                gen(p,use,k+1,n);
                use[i]=0;
            }
        }
    }
}
int main()
{
    int n;
    int p[MAX_N]={};
    int use[MAX_N]={};
    get_n();
    gen(p,use,1,n);
    //printf("Hello world!\n");
    return 0;
}
