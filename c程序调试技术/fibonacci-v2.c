#include <stdio.h>
#include <stdlib.h>

int fib(int n)
{
    //a bug here
    if(n==0 && n==1){
        return 1;
    }
    return fib(n-1)+fib(n-2);
}

int main()
{
    int n;
    //here is a bug.
    scanf("%d",n);

    printf("%d\n",fib(n));

    return 0;
}
