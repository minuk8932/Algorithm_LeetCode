package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 520번: DetectCapital
 *
 *	@see https://leetcode.com/problems/dectect-capital/description/
 *
 */
public class DetectCapital_520 {
	public boolean detectCapitalUse(String word){		// 모든 글자가 대문자 or 소문자 or 첫글자만 대문자 인경우에 capital
		boolean isCapital = false;
		boolean isNotCapital = false;
		int isFirst = 0;
		
		if(word.length() == 1){				// 길이가 1인경우 무조건 capital
			return true;
		}
		
		for(char words : word.toCharArray()){						// 길이가 1보다 클 경우
			if((words >= 'A' && words <= 'Z') && isFirst != 0){		// 단어가 첫 글자가 아니면서 대문자인경우 대문자 진리변수를 true 로 
				isCapital = true;
			}
			
			if(words >= 'a' && words <= 'z'){		// 단어가 소문자가 나타나는 경우, 소문자 진리변수를 true 로
				isNotCapital = true;
			}
			
			isFirst++;		// 첫글자인지 아닌지 판별할 값
		}
		
		return isCapital ^ isNotCapital;		// XOR를 통해 대문자만, 또는 소문자만 나온경우 true ^ false 이므로 true 반환, 둘이 동시에 나올경우 n ^ n 이므로 false 반환
	}
}
