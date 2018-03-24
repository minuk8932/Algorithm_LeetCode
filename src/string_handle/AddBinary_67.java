package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 67번 : Add Binary
 *
 *	@see https://leetcode.com/problems/add-binary/description/
 *
 */
public class AddBinary_67 {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int tmp = 0;
        
        while (aLen >= 0 || bLen >= 0) {			// 각 길이가 0이 아닐 때
            int sum = tmp;								// sum에 tmp를 담고
            
            if (bLen >= 0){								// a, b의 값을 정수화하여 뒤에서부터 거꾸로 담아주며 더하고, 각 길이를 줄여나감
            	sum += b.charAt(bLen--) - '0';
            }
            if (aLen >= 0){
            	sum += a.charAt(aLen--) - '0';
            }
            
            sb.append(sum % 2);						// sum의 나머지를 버퍼에 담고
            tmp = sum / 2;								// 나눈 몫을 다시 tmp 담아서 반복문 지속 실행
        }
        
        if (tmp != 0){				// 0이면 0이 아니면 계산 결과를 버퍼에 담음
        	sb.append(tmp);
        }
        
        return sb.reverse().toString(); // 버퍼에 담은 값들을 역으로 반환
	}
}
