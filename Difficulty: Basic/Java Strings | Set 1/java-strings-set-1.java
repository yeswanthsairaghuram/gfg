// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String str=S1 + S2;
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
        
    }
}