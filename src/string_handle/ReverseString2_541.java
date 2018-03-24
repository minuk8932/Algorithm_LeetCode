package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 541번 : Reverse String II
 *
 *	@see https://leetcode.com/problems/reverse-string-ii/description/
 *
 */
public class ReverseString2_541 {
	public String reverseStr(String s, int k) {
		char[] a = s.toCharArray();												// 해당 문자열을 캐릭터 배열에 하나씩 담음
		
		for (int start = 0; start < a.length; start += 2 * k) {			// 문제 조건에 따라 nk번째마다 반복문
			int i = start, j = Math.min(start + k - 1, a.length - 1);	// k 번째와 배열의 길이중 더 짧은 것을 뽑아내고
			
			while (i < j) {																// j가 시작 보다 클때만
				char tmp = a[i];														// 임시배열에 담고
				
				a[i++] = a[j];															// 각 알파벳을 하나씩 맞추어 앞뒤로 채워줌
				a[j--] = tmp;
			}
		}
		
        return new String(a);														// 캐릭터 배열을 다시 문자열로 변환 후 반환
	}
}
