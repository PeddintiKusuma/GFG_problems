def pos(n):
    ## Write the code
    k=1
    if n==0:
        print("already Zero")
    elif n>0:
        while k in range(abs(n+1)):
            print(n-k,end=" ")
            k+=1
    
def neg(n):
    ##Write the code
    k=1
    if n==0:
        print("already Zero")
    elif n<0:
        print(n,end=" ")
        while k in range(abs(n-1)):
            print(k+n,end=" ")
            k+=1
    