# Function should return an integer value
class Solution:
    def convertFive(self, n):
        # Code here
        n=str(n)
        return n.replace('0','5')