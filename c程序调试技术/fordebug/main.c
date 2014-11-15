#include <stdio.h>
#include <stdlib.h>

void calc(int fib[],int n)
{
    int i;
    for (i = 0; i < n; i++) {
        fib[i]=fib[i-1]+fib[i-2];
    }
}

int main()
{
    int i,n,fib[100];
    //wrong1: fib[0]=fib[1]=1;
    scanf("%d", &n);
    //wrong2: for (i = 2; i < n; i++) {
    calc(fib,n);

    for (i = 0; i < n; i++) {
        printf("%d\n", fib[i]);
    }

    return 0;
}
