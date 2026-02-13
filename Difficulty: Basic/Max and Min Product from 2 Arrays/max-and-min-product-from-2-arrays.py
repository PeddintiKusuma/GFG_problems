#User function Template for python3

class Solution:
    # Function to find the maximum element from array arr1 and 
    # the minimum element from array arr2 and return their product.
    def find_multiplication(self, arr1, arr2):
        # code here
        max1=arr1[0]
        min1=arr2[0]
        for i in range(len(arr1)):
            if arr1[i]>max1:
                max1=arr1[i]
        for i in range(len(arr2)):
            if arr2[i]<min1:
                min1=arr2[i]
        return max1*min1
        
