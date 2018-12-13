import java.util.List;

public class PhoneNumber {
	private String[][] button = new String[][] {{},{},
		{"a", "b", "c"}, {"d", "e", "f"},
		{"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
		{"p","q","r","s"}, {"t","u","v"}, {"w", "x", "y", "z"}};
	private void helper(String digits, int counter, String solution, List<String> res) {
		if(counter == digits.length()) {
			res.add(solution);
			return;
			
		}
		int firstIndex = digits.charAt(counter);
		int secondIndex = 0;
		
		while(secondIndex < button[firstIndex].length) {
			solution = solution.concat(button[firstIndex][secondIndex]);
			helper(digits, counter +1, solution, res);
			solution = solution.substring(0, solution.length()-1);
			secondIndex ++;
		}
		return;
	

}
	public List<String> letterCombinations(String digits){
		List<String> res = new ArrayList<>();
		if(digits.length() == 0) return res;
		String str = "";
		helper(digits, 0, str, res);
		return res;
	}
}

