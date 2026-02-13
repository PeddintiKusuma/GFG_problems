#User function Template for python3
class Solution:

	def maxProduct(self,arr):
		# code here
		arr.sort()
		return arr[-1]*arr[-2]