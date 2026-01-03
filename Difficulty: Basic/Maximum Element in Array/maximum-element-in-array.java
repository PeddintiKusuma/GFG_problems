class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=Arrays.stream(arr).max().getAsInt();
        return max;
    }
}
