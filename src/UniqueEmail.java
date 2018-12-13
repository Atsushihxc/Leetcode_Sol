import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
    	HashSet addr = new HashSet();
    	for (String email:emails) {
    		String first[] = email.split("@");
    		String second[] = first[0].replaceAll(".", "").split("[+]");
    		addr.add(second[0]+first[1]);
    	}
    	return addr.size();
    }
}