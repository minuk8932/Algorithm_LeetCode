package string_handle;
/**
 * 
 * 	@author minchoba
 *	LeetCode 551번 : Student Attendance Record I
 *
 *	@see https://leetcode.com/problems/student-attendance-record-i/description/
 *
 */
public class StudentAttendaceRecord1_551 {
	public boolean checkRecord(String s) {
		int A = 0;
		boolean isSuccess = false;
		
		for(char att : s.toCharArray()){					// 출석 현황을 하나씩 문자배열로 받아와 결석이 있는지 체크 후 있으면 +1
			if(att == 'A'){
				A++;
			}		
		}
		
		return isSuccess = (A > 1) || s.contains("LLL") ? false : true;	// 지각은 연속해서 3번이상만 안하면 되므로 "LLL"이 존재하는지 체크 후 성공적인 출결인지 반환
		
	}
}
