/**
 * study about the ASCII code
 * 
 * @author Atsushi
 *
 */
public class titleToNumber {
    public int titleToNumber(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number += ((int)s.charAt(i) - 64) * (int)Math.pow(26, s.length() - 1 - i);
        }
        return number;
    }
}
