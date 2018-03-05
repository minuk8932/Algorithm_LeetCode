package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 791번 : Custon Sort String
 *
 *	@see https://leetcode.com/problems/custom-sort-string/description
 *
 */
public class CustomSortString_791 {
	public String customSortString(String S, String T) {
        int[] count = new int[26];							// 알파벳 갯수 만큼 정수형 배열 선언
        
        for (char c: T.toCharArray()){					// 해당 알파벳에 따라 배열에 값을 더해줌 즉, a = 0 ....
            count[c - 'a']++;
        }
            
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {					// 문자열 S를 문자로 하나씩 받고
            for (int i = 0; i < count[c - 'a']; ++i){		// 각 문자가 나온 수만큼 반복문을 실행하여
                sb.append(c);										// 해당 문자를 버퍼에 저장
            }
            
            count[c - 'a'] = 0;									// 한번 실행한 문자에 대한 배열은 0으로 초기화 (중복 제거)
        }

        for (char c = 'a'; c <= 'z'; ++c){					// a~z 까지
            for (int i = 0; i < count[c - 'a']; ++i){		// 다시 반복문을 실행하여
                sb.append(c);										// 버퍼에 해당 문자 저장, 즉 S를 제외한 문자열 T에 존재했던 문자만 저장
            }
        }

        return sb.toString();									// 버퍼안의 내용을 문자열로 반환
    }
}
