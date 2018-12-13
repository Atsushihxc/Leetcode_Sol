/**
 * this is a very tedious qn!!
 * This the first license pad can be any number, we look at the remainder
 * 
 * a couple of important methods to be remembered here:
 * string.toUpperCase() &&string.toLowercase;
 * string.split("delimiter") gives an array of Strings
 * String.join("delimiter",array) turns a string array to a string
 * @author Atsushi
 *
 */

class Solution {
    public String licenseKeyFormatting(String S, int K) {
    	StringBuilder sb = new StringBuilder();
        String SS = S.toUpperCase();
    	String[] sp = SS.split("-");
    	String str = String.join("",sp);
        if (str == null) return null;
        int fir = str.length()%K;
        sb.append(str.substring(0,fir));
        int s = fir;
        while(s<str.length()){
            if (s!=0) sb.append("-");
            int times = K;
            while(times >0){
                sb.append(str.charAt(s));
                s++;
                times--;
            }
        }

        return sb.toString();
    }
}