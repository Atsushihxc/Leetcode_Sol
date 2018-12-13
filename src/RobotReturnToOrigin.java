import java.util.HashMap;
import java.util.Map;

class Solution {
   public boolean judgeCircle(String moves) {
	   int x = 0;
	   int y = 0;
	   for(int i = 0; i<moves.length();i++) {
		   if(moves.charAt(i) =='L') x--;
		   if(moves.charAt(i) == 'R') x++;
		   if(moves.charAt(i) == 'U') y++;
		   if(moves.charAt(i) =='D') y--;
	   }
	   if (x ==0 && y==0) return true;
	   else return false;
	   
//	   String noleft = moves.replace("L","");
//	   String noright = moves.replace("R","");
//	   if(noleft.length() != noright.length()) return false;
//	   String noup = moves.replace("U","");
//	   String nodown = moves.replace("D","");
//	   if(noup.length() != nodown.length()) return false;
//	   return true;
//    Map<Character, Integer> move = new HashMap<Character, Integer>();
//    move.put('U', 0);
//    move.put('D', 0);
//    move.put('L', 0);
//    move.put('R', 0);
//    
//    for(int i=0; i<moves.length(); i++) {
//    	int freq = move.get(moves.charAt(i));
//    	freq = freq+1;
//    	move.put(moves.charAt(i), freq);
//    }
//    if(move.get('L')!=move.get('R')) return false;
//    if(move.get('U')!= move.get('D')) return false;
//    return true;
//    
//
//    
//        
    }
//    

}