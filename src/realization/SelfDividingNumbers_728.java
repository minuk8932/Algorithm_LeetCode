package realization;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 	@author minchoba
 *	LeetCode 728번 : SelfDividingNumbers
 *
 *	@see https://leetcode.com/problems/self-dividing-numbers/description
 *
 */
public class SelfDividingNumbers_728 {	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> sdNums = new ArrayList<>();						// 반환 할 리스트 선언
		
		char[][] digit = new char[right - left + 1][]; 						// 자리마다 나누기 위한 캐릭터 배열 선언
		int[] nums = new int[right - left + 1];								// 실제 값을 담을 정수형 배열
		int idx = 0;
		
		for(int i = left; i < right + 1; i++){										// 데이터를 나누어 담아줌
			nums[idx] = i;
			digit[idx] = String.valueOf(i).toCharArray();
			idx += 1;
		}
		
		for(int i = 0; i < right - left + 1; i++){
			int cnt = 0;
			for(int j = 0; j < digit[i].length; j++){
				int tmp = Character.getNumericValue(digit[i][j]);		// 자리별로 나눈 캐릭터 값을 다시 정수형으로 변환 후
				if(tmp != 0){															// 0으로 나누면 안되므로 예외처리
					if(nums[i] % tmp == 0){										// 나누어지는가?
						cnt++;															// 나누어지는 값이라면 카운트 +1 증가
					}
				}
			}
			
			if(cnt == digit[i].length){												// 각 자리가 모두 잘 나누어 진다면
				sdNums.add(nums[i]);												// 리스트에 해당 값을 담고
			}
		}
		
		return sdNums;																// 결과로 반환
	}
}
