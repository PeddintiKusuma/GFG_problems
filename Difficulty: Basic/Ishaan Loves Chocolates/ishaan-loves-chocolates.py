from typing import List


class Solution:
    def chocolates(self, n : int, arr : List[int]) -> int:
        # code here
        arr.sort()
        return arr[0]
        
