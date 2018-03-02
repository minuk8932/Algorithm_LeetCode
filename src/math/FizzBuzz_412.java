package math;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 	@author minchoba
 *	LeetCode 412번 : FizzBuzz
 *
 *	@see https;//leetcode.com/problems/fizz-buzz/description/
 *
 */
public class FizzBuzz_412 {
	public List<String> fizzBuzz(int n) {
		List<String> fb = new ArrayList<>();
		
		for(int i = 1; i < n + 1; i++){
			if(i % 3 == 0 && i % 5 ==0){			// 3, 5 공배수 : 반드시 먼저 검사해야함, 아니라면 다른 Buzz나 Fizz 값이 들어가게됨
				fb.add("FizzBuzz");
			}
			else if(i % 5 == 0){						// 5 배수
				fb.add("Buzz");
			}
			else if(i % 3 == 0){						// 3배수
				fb.add("Fizz");
			}
			else{
				fb.add(String.valueOf(i));		// 이외는 값 그대로 String으로 담아줌
			}
		}
		
		return fb;										// 결과 반환
	}
}
