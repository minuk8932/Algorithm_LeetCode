package string_handle;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 	@author minchoba
 *	LeetCode 500번 : Keyboard Row
 *
 *	@see https://leetcode.com/problems/keyboard-row/description
 *
 */
public class KeyboardRow_500 {
	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<String>();
		final String[] KEY = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};			// 키보드 라인 선언

		for (String tmp : words) {															// 주어진 입력을 하나씩 받아옴
			if (wordChecker(tmp.toLowerCase(), KEY[0])){							// 메소드가 참이라면, 리스트에 해당 단어를 추가 
				list.add(tmp);
			}
		
			if (wordChecker(tmp.toLowerCase(), KEY[1])){
				list.add(tmp);
			}
			
			if (wordChecker(tmp.toLowerCase(), KEY[2])){
				list.add(tmp);
			}
		}
		
		return list.toArray(new String[list.size()]);									// 리스트를 스트링 배열로 반환
	}
	
	/**
	 * 
	 * 	@param word : 주어진 단어(모두 소문자로 바꾼)
	 *	@param KEY : 키보드 라인
	 *	@return : 각 라인마다 해당 단어가 라인에 모두 속해있는지 체크 후 속해 있다면 true 반환
	 *
	 */
	private boolean wordChecker(String word, final String KEY) {
		for (int i = 0; i < word.length(); i++) {											// 입력된 단어 내에 키보드 한줄에 속해있는지 체크 후 -1이라면 거짓, 아니면 참을 반환
			if (KEY.indexOf(word.charAt(i)) < 0){
				return false;
			}
		}
		return true;
	}
}
