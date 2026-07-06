class Solution:
    def armstrongNumber (self, n):
        # code here 
        num=n
        le=len(str(n))
        sum=0
        
        while n>0:
            d=n%10
            sum+=d**le
            n=n//10
        if sum==num:
            return True
        else:
            return False