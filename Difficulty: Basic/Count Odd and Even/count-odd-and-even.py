class Solution:
	def countOddEven(self, arr):
		#Code here
		count_even=0
        count_odd=0
        n=len(arr)
        for i in range(n):
            if arr[i]%2==0:
                count_even+=1
            else:
                count_odd+=1
        return [count_odd,count_even]
        