class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        if a<0:
            if b>0 and flag==False:
                return(True)
            elif b<0 and flag==True:
                return(True)
        elif a>0:
            if b>0 and flag==True:
                return(False)
            if b<0 and flag==False:
                return(True)
                