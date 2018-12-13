class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder nb = new StringBuilder();
        for(int i = 0; i<digits.length; i++){
            nb.append(Integer.toString(digits[i]));
        }
        
        String number = nb.toString();
        int temp = Integer.parseInt(number);	
        temp ++;
        String nb2 = Integer.toString(temp);
        int[] copy = new int[nb2.length()];
        for(int j =0; j<nb2.length(); j++){
            copy[j] = Integer.parseInt(Character.toString(nb2.charAt(j)));
            
        }
        return copy;


        
    }
}