package string_handle;

/**
 * 
 *	@author minchoba
 *	LeetCode 461 번 : Hamming Distance
 *
 *	@see https://leetcode.com/problems/hamming-distance/description/
 *
 */
public class HammingDistance_461 {
	public int hammingDistance(int x, int y) {
		String xStr = String.valueOf(Integer.toBinaryString(x));		// 데이터를 2진수로 변환해 문자열로 치환
		String yStr = String.valueOf(Integer.toBinaryString(y));
		
		int xLeng = xStr.length();
		int yLeng = yStr.length();
		int diff = 0, cnt = 0;

		if(xLeng != yLeng){																// 문자열 길이에 따라 계산
			if(xLeng > yLeng){
				diff = xLeng - yLeng;
				String tmp = yStr;
				yStr = "0";
				
				for(int i = 1; i < diff; i++){
					yStr += "0";
				}
				yStr += tmp;		
			}
			else{
				diff = yLeng - xLeng;
				String tmp = xStr;
				xStr = "0";
				
				for(int i = 1; i < diff; i++){
					xStr += "0";
				}
				xStr += tmp;
			}
		}
		
		int maxLeng = xLeng > yLeng ? xLeng : yLeng;						// 위에서 불러온 길이 중 더 긴 것을 최대 길이로 선언
		
		for(int i = 0; i < maxLeng; i++){											// 각 위치별 데이터가 다르면 cnt +1
			if(yStr.charAt(i) != xStr.charAt(i)){
				cnt++;
			}
		}
		
		return cnt;																		// 결과값 반환
	}
}

/*
 * 		수학적 접근 (이산수학, 출처 : Leet Code 토론 게시판)
 *		public class Solution {
 *   		public int hammingDistance(int x, int y) {
 *       		return Integer.bitCount(x ^ y);				// XOR 연산
 *   		}
 *		} 
 *
 */
