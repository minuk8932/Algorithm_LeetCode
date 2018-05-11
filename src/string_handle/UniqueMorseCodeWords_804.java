package string_handle;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * 	@author minchoba
 *	LeetCode 804번: Unique Morse Code Words
 *
 *	@see https://leetcode.com/problems/unique-morse-code-words/description/
 *
 */
public class UniqueMorseCodeWords_804 {
	private static final String[] MORSE = {".-","-...","-.-.","-..",".",
															"..-.","--.","....","..",".---",
															"-.-",".-..","--","-.","---",
															".--.","--.-",".-.","...","-",
															"..-","...-",".--","-..-","-.--","--.."};			// 모스부호 저장 배열
	
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> wordSet = new HashSet<>();					// 중복 제거를 위한 해쉬 셋 사용
		
        for (String word: words) {
            StringBuilder sb = new StringBuilder();			// 빌더를 통해 담은 문자열을 각 경우의 수 마다 한번씩 초기화
            
            for (char c: word.toCharArray()){		// 파라미터로 들어온 단어를 문자 하나씩 뽑아내고, 버퍼에 담음
                sb.append(MORSE[c - 'a']);
            }
            
            wordSet.add(sb.toString());			// 버퍼에 담긴 해당 문자열을 문자열 형태로 셋에 저장
        }

        return wordSet.size();		// 중복을 제거한 집합의 크기를 출력
	}
}
