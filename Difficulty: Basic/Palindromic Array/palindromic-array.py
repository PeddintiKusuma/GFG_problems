# Your task is to complete this function
# Function should return true/false
def isPalinArray(arr):
    # Code here
    n=len(arr)
    bool=False
    for i in arr:
        if str(i)!=str(i)[::-1]:
            return False
    return True
        