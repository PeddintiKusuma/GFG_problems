import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);
                
                // Move left forward skipping duplicates
                int currentLeft = arr[left];
                while (left < right && arr[left] == currentLeft) {
                    left++;
                }
                
                // Move right backward skipping duplicates
                int currentRight = arr[right];
                while (left < right && arr[right] == currentRight) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else { // sum > 0
                right--;
            }
        }
        
        return res;
    }
}
