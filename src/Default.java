
public class Default {
	public static void main(String[] args) throws Exception {
		String s = "leetcode";
		
		int[][] alpha = new int[26][2];
		int seq = 0;
		
		for(char a : s.toCharArray()){
			alpha[a - 'a'][0]++;
			alpha[a - 'a'][1] = seq;
			
			seq++;
		}
		
		
	}
}
