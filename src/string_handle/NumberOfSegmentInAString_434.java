package string_handle;
import java.util.StringTokenizer;

/**
 * 
 * 	@author minchoba
 *	LeetCode 434번 : Number of Segment in a String
 *
 *	@see https://leetcode.com/problems/number-of-segment-in-a-string/description/
 *
 */
public class NumberOfSegmentInAString_434 {
	public int countSegments(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");			// 해당 문자열을 " " 기준으로 잘라줌
		return st.countTokens();											// 토큰 갯수 반환
	}
}
