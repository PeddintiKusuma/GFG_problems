// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        StringBuilder sb=new StringBuilder();
        int i=0;
        while( i<S.length()){
            if(i%2==0){
                sb.append(S.charAt(i));
            }
            i++;
        }
        
        return sb.toString();
    }
}