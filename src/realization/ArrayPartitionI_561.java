package realization;
import java.util.Arrays;

/**
 * 
 * 	@author minchoba
 *	LeetCode 561번 : Array Partition I
 *	
 *	@see https://leetcode.com/problems/array-partition-i/description/
 *
 */
public class ArrayPartitionI_561 {
	public int arrayPairSum(int[] nums) {
		
		Arrays.sort(nums);									// 배열 내부 오름차순 정렬
		int sum = 0;		
		
		for(int i = 0; i < nums.length; i += 2){
			sum += Math.min(nums[i], nums[i + 1]);	// 앞에서부터 데이터 2개중 가장 작은수를 골라내어 결과값에 합해줌
		}
		
		return sum;												// 결과 반환
	}
}
