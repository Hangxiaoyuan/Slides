DEBUG=True

def fib2(n):
    if n==0 or n==1:
        return 1

    return fib(n-1) + fib(n-2)

def fib(n):
    if n==0 or n==1:
        return 1

    return fib2(n-1) + fib(n-2)

if DEBUG==True:
    import pdb
    pdb.set_trace()

n=input()
n=int(n)
# wrong here: n should be fib(n)
print(fib(n))
n=n/0
