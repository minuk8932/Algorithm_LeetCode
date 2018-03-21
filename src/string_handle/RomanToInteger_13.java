package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 13번 : Roman to Integer
 *
 *	@see https://leetcode.com/problems/roman-to-integer/description/
 *
 */
public class RomanToInteger_13 {
	public int romanToInt(String s) {
		char[] roms = s.toCharArray();				// 들어온 문자열을 캐릭터 배열에 담음
		int[] nums = new int[roms.length];			// 로마 문자에 다른 숫자를 담을 배열
		int[] cals = {1, 5, 10, 50, 100, 500, 1000};	// 각 로마 문자마다의 정수 값
        int res = 0;
		
		String words = "IVXLCDM";						// 로마 문자의 크기 순 (차례로 1, 5 10, 50, 100, 500, 1000)
		int leng = words.length();
		
		for(int i = 0; i < roms.length; i++){			// nums 배열에 로마 문자에 따른 값을 하나씩 담아줌
			for(int j = 0; j < leng; j++){
				if(roms[i] == words.charAt(j)){
					nums[i] = cals[j];
				}
			}
		}
		
		for(int i = 0; i < nums.length - 1; i++){		// 만약 nums 배열 안의 i 인덱스의 값이 i + 1보다 작은경우 음수를, 반대의 경우 양수를 결과값에 합함 
        	if(nums[i] < nums[i + 1]){
            	res -= nums[i];
            }
            else{
            	res += nums[i];
            }
        }
        
        return res + nums[nums.length-1];			// 결과 값에 nums 배열의 마지막 값을 더한 후 반환
	}
}
