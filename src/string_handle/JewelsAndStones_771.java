package string_handle;

/**
 * 
 * 	@author minchoba
 *	LeetCode 771번 : Jewels and Stones
 *
 *	@see https://leetcode.com/problems/jewels-and-stones/description/
 *
 */
public class JewelsAndStones_771 {
	public int numJewelsInStones(String J, String S){		// 해당 메소드 선언
		char[] sepJ = J.toCharArray();							// 입력으로 들어오는 각 문자열을 캐릭터 배열에 하나씩 분리시켜 저장
		char[] sepS = S.toCharArray();
		int chkJ = 0;														// 돌에 끼어있는 원석의 갯수를 파악할 정수형 변수
		boolean[] isVisited = new boolean[sepS.length];	// 돌에 낀 원석 중 이미 회수 된 것을 배제시키기 위한 진리형 배열
		
		for(int i = 0; i < sepJ.length; i++){
			for(int j = 0; j < sepS.length; j++){
				if(sepJ[i] == sepS[j] && !isVisited[j]){			// 돌에 원석이 껴있고, 해당 원석이 아직 회수되지 않았다면,
					isVisited[j] = true;									// 회수했다고 표시하고
					chkJ++;													// 원석의 갯수를 1 증가
				}
			}
		}
		
		return chkJ;
	}
}

/*
 	// 이런식의 코드 구성을 통해 1줄로 처리 가능 (출처 : LeetCode  토론 게시판)
	public int numJewelsInStones(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();
	}
*/