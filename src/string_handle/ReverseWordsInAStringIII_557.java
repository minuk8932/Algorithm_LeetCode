package string_handle;
import java.util.StringTokenizer;

/**
 * 
 * 	@author minchoba
 *	LeetCode 557번 : Reverse words in a String III
 *
 *	@see https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 */
public class ReverseWordsInAStringIII_557 {
	public String reverseWords(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");		// 받아온 문자열을 공백 기준으로 잘라줌
		String res = null;
		
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()){										// 공백기준 자른 문자열이 남아있을경우 계속 돌아감
			res = st.nextToken();											// 변수에 1개의 문자열을 담음
			char[] tmp = res.toCharArray();							// 이를 다시 문자 배열에 하나씩 쪼개어 담은 후
			
			for(int i = 0; i < tmp.length; i++){
				sb.append(tmp[tmp.length - 1 - i]);					// 순서 역전 후 버퍼에 담아줌
			}
			sb.append(" ");													// 단어별로 공백을 다시 넣어준 후
		}
		
		return sb.toString().trim();									// 맨 끝에 생길 공백을 없앤채로 결과 반환
	}
}
