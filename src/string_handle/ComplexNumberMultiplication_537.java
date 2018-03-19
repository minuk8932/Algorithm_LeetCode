package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 537번 : ComplexNumberMultiplication
 *
 *	@see https://leetcode.com/problems/complex-number-multiplication/description/
 *
 */
public class ComplexNumberMultiplication_537 {
	public String complexNumberMultiply(String a, String b) {
		StringBuilder sb = new StringBuilder();						// 버퍼 객체 생성
		
		String aNums[] = a.split("\\+|i");							// 제외시킬 문자열을 |로 구분지어 입력, split은 정규식으로 표현되며, |는 정규식 예약어임
        String bNums[] = b.split("\\+|i");							// 따라서 |에는 이스케이프 '\'가 필요한데, 큰 따옴표 안에서 '\' 한개는 인식이 안되므로 "\\"이렇게 써준다.
        
        int nums1 = Integer.parseInt(aNums[0]);					// 위의 식에따라 찢어진 숫자들을 형변환 하여 하나씩 배열에 담는다
        int nums2 = Integer.parseInt(aNums[1]);
        int nums3 = Integer.parseInt(bNums[0]);
        int nums4 = Integer.parseInt(bNums[1]);
        
        // 형변환된 숫자를 계산 후 버퍼에 담아줌
       sb.append(nums1 * nums3 - nums2 * nums4).append("+").append(nums1 * nums4 + nums2 * nums3).append("i");
        
        return sb.toString();		// 버퍼내의 결과값 출력
	}
}
