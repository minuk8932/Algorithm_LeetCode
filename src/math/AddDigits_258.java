package math;
/**
 * 
 * 	@author minchoba
 *	LeetCode 258번 : Add Digits
 *
 *	@see https://leetcode.com/problems/add-digits/description/
 *
 */
public class AddDigits_258 {
	public int addDigits(int num) {
		return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));	// 수식의 규칙에 의한 결과
	}
}
