package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 476번 : Number Complement
 *
 *	@see https://leetcode.com/problems/number-complement/description/
 *
 */
public class NumberComplement_476 {
	public int findComplement(int num) {
		String str = Integer.toBinaryString(num);				// 해당 값을 2진수로 변환하여 받음
		char[] bin = str.toCharArray();								// 변환된 2진수를 캐릭터 배열에 할당
		
		int res = 0;
		
		for(int i = 0; i < bin.length; i++){
			if(str.charAt(i) == '0'){										// 보수 구하기
				bin[i] = '1';
			}
			else{
				bin[i] = '0';
			}
			
			if(bin[i] == '1'){													// 보수 중 1인것이 있으면 2진수를 10진수로 변환
				res += (int)Math.pow(2, (bin.length - 1) - i);
			}
		}
		
		return res;															// 결과값 출력
	}
}
