#User function Template for python3

class Solution:
      
    def lastSeenElement(self, arr): 
          
        # Complete the function
        dic={}
        ind=0
        for ele in arr:
            dic[ele]=ind
            ind=ind+1
        
        min_val=min(dic.values())
        for k,v in dic.items():
            if v==min_val:
                return k
        return -1