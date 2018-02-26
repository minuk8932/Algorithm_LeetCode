package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 657 번 : JudgeRouteCircle
 *
 *	@see https://leetcode.com/problems/judge-route-circle/description/
 *
 */
public class JudgeRouteCircle_657 {
	public boolean judgeCircle(String moves) {
		int leng = moves.length();						// 해당 문자열 길이를 뽑아냄
		int[] isCircle = new int[4];
		
		for(int i = 0; i < leng; i++){						// 문자 별 갯수 파악
			switch(moves.charAt(i)){
			case 'U':
				isCircle[0]++;
				break;
			
			case 'D':
				isCircle[1]++;
				break;
			
			case 'L':
				isCircle[2]++;
				break;
			
			case 'R':
				isCircle[3]++;
				break;
			}
		}
		
		if(isCircle[0] == isCircle[1] && isCircle[2] == isCircle[3]){		// U, D의 갯수가 같으면서 L, R의 갯수가 같다면 참
			return true;
		}
			else{
				return false;															// 이외는 거짓
		}
	}	
}

/*
 * 		// 코드 2줄만에 해당 문제 해결 (출처 : Leet Code 토론게시판)
 * 		public boolean judgeCircle(String moves) {
 * 			moves=" " + moves + " ";
 * 			return moves.split("L").length==moves.split("R").length && moves.split("U").length == moves.split("D").length;
 * 		}
 * 
 */
