package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 387번 : First Unique Character in a String
 *
 *	@see https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 */
public class FirstUniqueCharacterInAString_387 {
	public int firstUniqChar(String s) {
		int[][] alpha = new int[26][2];
		int seq = 0;
		
		for(char a : s.toCharArray()){			// 받아온 문자열을 캐릭터배열로 하나씩 구분해서 반복문 실행
			alpha[a - 'a'][0]++;						// 알파벳을 a = 0 부터 z = 25까지 인덱스를 할당해 현재 들어온 알파벳에 해당하는 인덱스 + 1 
			alpha[a - 'a'][1] = seq;					// 각 알파벳이 들어오는 순서를 저장
			
			seq++;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < alpha.length; i++){		// 반복문을 돌려 1회만 등장하는 알파벳(즉, alpha[i][0] == 1) 중 최솟 값을 뽑아내고
			if(alpha[i][0] == 1){
				min = Math.min(min, alpha[i][1]);
			}
		}
		
		for(int i = 0; i < alpha.length; i++){		// 최솟값이 존재하는 경우 최솟값 반환
			if(alpha[i][1] == min){
				return min;
			}
		}
		
		return -1;											// 존재하지 않는 경우, 즉 모든 알바펫이 중복되어 나오는 경우 -1 반환
	}
}
