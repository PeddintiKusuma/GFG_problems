#User function Template for python3

class Solution:
    def totalFine(self, date, car, fine):
        #Code here
        total=0
        n=len(car)
        for i in range(n):
            if date%2==0 and car[i]%2!=0:
                total=total+fine[i]
            elif date%2!=0 and car[i]%2==0:
                total+=fine[i]
        return total
                
    
    
    