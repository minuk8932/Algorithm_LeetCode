package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 344번 : Reverse String
 *
 * 	@see https://leetcode.com/problems/reverse-string/description
 *
 */
public class ReverseString_344 {
	public String reverseString (String s){
		int sLen = s.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = sLen - 1; i >= 0; i--){			// 스트링을 뒤에서부터 한글자씩 가져와서 버퍼에 담음
			sb.append(s.charAt(i));
		}
		
		return sb.toString();							// 버퍼의 내용 한번에 출력
	}
}
