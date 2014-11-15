#include <stdio.h>
#include <stdlib.h>

void test()
{
    printf("hi!\n");
}

int main()
{
    int i,n,fib[100];
    //wrong1: fib[0]=fib[1]=1;
    test();
    scanf("%d", &n);

    //wrong2: for (i = 2; i < n; i++) {
    for (i = 0; i < n; i++) {
        fib[i]=fib[i-1]+fib[i-2];
    }
    for (i = 0; i < n; i++) {
        printf("%d\n", fib[i]);
    }

    return 0;
}
