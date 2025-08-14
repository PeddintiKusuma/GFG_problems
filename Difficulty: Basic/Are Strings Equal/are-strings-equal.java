// User function Template for Java
class Solution {
    public static boolean areEqual(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
                 
            
        }
        return true;
        
        
        
    }
}