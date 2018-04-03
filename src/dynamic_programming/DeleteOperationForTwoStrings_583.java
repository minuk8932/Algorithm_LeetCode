package dynamic_programming;

/**
 * 
 * 	@author minchoba
 *	LeetCode 583번 : Delete Operation for Two Strings
 *
 *	@see https://leetcode.com/problems/delete-operation-for-two-strings/description/
 *
 */
public class DeleteOperationForTwoStrings_583 {							// 문자열 처리 중 동적계획법 LCS(Longest Common String)를 이용한 문제
	public int minDistance(String word1, String word2) {
		int dp[][] = new int[word1.length()+1][word2.length()+1];		// 디피 배열에 각 문자열의 길이에 따라 크기를 할당
		
	    for(int i = 0; i < word1.length() + 1; i++) {								// 두 문자열 중 하나가 0 일 경우도 있으므로, 인덱스는 0부터 시작
	        for(int j = 0; j < word2.length() + 1; j++) {
	            if(i == 0 || j == 0) {														// 각 인덱스 별로 첫 디피 배열에는 0을 할당
	            	dp[i][j] = 0;
	            }																				// 이외의 경우에는, 둘의 문자가 같다면 이전 문자열에서 +1 길이 만큼을 더한 값을 다음 배열에
	            else {																		// 다른 경우엔, 아래의 인덱스에 해당하는 값 중 최댓값을 가져와서 다음 배열에 담아준다
	            	dp[i][j] = ((word1.charAt(i-1) == word2.charAt(j-1)) ? dp[i-1][j-1] + 1 : Math.max(dp[i-1][j], dp[i][j-1]));
	            }
	        }
	    }
	    
	    int val =  dp[word1.length()][word2.length()];						// 동적계획법으로 찾아낸 최종 값(공통이 아닌 문자의 갯수)을  val 변수에 넣고,
	    return word1.length() - val + word2.length() - val;				// 길이에서 해당 값만큼 빼주어 연산 횟수를 구해준다.
	}
}
