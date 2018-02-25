package realization;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 	@author minchoba
 *	LeetCode 1번 : Two Sum
 *
 *	@see https://leetcode.com/problems/two-sum/description/
 *
 */
public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target){					// 배열 반환 메소드 선언
		 int[] result = new int[2];										// 결과를 출력할 크기 2의 배열 선언

		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();	// 해쉬맵 선언
		 
		 for(int i = 0 ; i < nums.length; i++){							// 들어올 입력의 크기에 맞춘 반복문
		   if(map.containsKey(target-nums[i])){					// 맵 내부에 target - nums[i]에 해당하는 값이 있다면
		      result[0] = map.get(target-nums[i]);				// 결과 배열에 각 인덱스를 담은 후
		      result[1] = i;
		      return result;													// 배열 반환
		   } 
		   else {
		      map.put(nums[i], i);											// 해당 값이 없다면, 해당 배열의 값과 인덱스를 맵에 추가 (예외 처리)
		   }
		 }
		
		 return result;														// 끝까지 답이 안나올 경우 [0, 0] 출력 (예외 처리)
	}
}
