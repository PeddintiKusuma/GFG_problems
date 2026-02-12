
from typing import List


class Solution:
    def isPerfect(self, arr : List[int]) -> bool:
        # code here
        if arr[:]==arr[::-1]:
            return True
        else:
            return False
        
