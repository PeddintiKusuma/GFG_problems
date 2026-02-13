#User function Template for python3

def game_with_number (arr,  n) : 
    #Complete the function
    lst=[]
    
    for i in range(n-1):
        res=arr[i]^arr[i+1]
        lst.append(res)
    lst.append(arr[-1])
    return lst
    