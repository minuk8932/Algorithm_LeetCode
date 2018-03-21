package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 383번 : Ransom Note
 *
 *	@see https://www.leetcode.com/problems/ransom-note/description/
 *
 */
public class RansomNote_383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] alpha = new int[26];
		int lenR = ransomNote.length();
		int lenM = magazine.length();
		boolean[] isVisited = new boolean[26];
		
		for(int i = 0; i < lenR; i++){							// Ransom note에 등장하는 단어를 각 알파 배열의 인덱스 별로 +1, 해당 인덱스를 방문한 것으로 처리
			int idx = ransomNote.charAt(i) - 'a';
			alpha[idx]++;
			isVisited[idx] = true;
		}
		
		for(int i = 0; i < lenM; i++){							// Magazine에 등장하는 단어를 각 알파 배열의 인덱스 별로 -1
			alpha[magazine.charAt(i) - 'a']--;
		}
		
		boolean res = true;									// 기본값 참
		
		for(int i = 0; i < alpha.length; i++){				// 0보다 큰 즉, magazine에 등장하지 않고 동시에, 방문 했던 인덱스의 경우
			if(alpha[i] > 0 && isVisited[i]){
				res = false;										// 거짓
			}
		}
		
        return res;												// 결과 반환
	}
}
