package binary_tree;

/**
 * 
 * 	@author minchoba
 *	LeetCode 617번 : MergeTwoBinaryTrees
 *
 *	@see https://www.leetcode.com/problems/merge-two-binary-trees/description
 *
 */
public class MergeTwoBinaryTrees_617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null){	
			return t2;
		}
		
		if (t2 == null){
        	return t1;
		}																// 한쪽이 null인 경우 연산이 필요하지 않음
		
        t1.val += t2.val;											// 둘 다 값을 가진 경우 두 값을 합친다.
        t1.left = mergeTrees(t1.left, t2.left);			// 루트 노드 기준 왼쪽은 왼쪽끼리 더해서 루트노드의 왼쪽으로
        t1.right = mergeTrees(t1.right, t2.right);		// 오른쪽도 마찬가지로 실행 해주는데, 재귀로 자식노드까지 연산

		return t1;													// merge의 결과를 담아서 결과 반환
	}
    
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
	}
}
