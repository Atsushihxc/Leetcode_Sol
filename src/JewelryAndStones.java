/**
 * what do we have to know here??close bracket for map
 * the returned value is a global variable;
 */


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> js= new HashMap<Character, Integer>();
        for(int i =0; i<J.length(); i++){
            js.put(J.charAt(i),0);
            }
        for(int k = 0; k<S.length();k++){
            if(js.containsKey(S.charAt(k))){
                int num = js.get(S.charAt(k));
                num++;
                js.put(S.charAt(k), num);
            }
        }
        int sum = 0;
        for(char ch: js.keySet()){
            sum = sum+js.get(ch);
        }
        
        return sum;
    }
}