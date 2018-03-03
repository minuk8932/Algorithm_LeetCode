package string_handle;
import java.util.Stack;

/**
 * 
 * 	@author minchoba
 *	LeetCode 20번 : Valid Parentheses
 *
 *	@see https://leetcode.com/problems/valid-parentheses/description/
 *
 */
public class ValidParentheses_20 {
	public boolean isValid(String s) {
		char[] pair = s.toCharArray();
		boolean[] chk = new boolean[pair.length];							// 이미 방문된것인지 확인하기위한 논리 배열
		
		Stack<Character> parentheses = new Stack<>();					// stack을 통한 괄호 확인
		
		if(pair[0] == ']' || pair[0] == '}' || pair[0] == ')'){					// 시작값이 '], }, )'의 경우 무조건 false 반환
            return false;
        }
		
		if(pair.length % 2 == 1){														// 짝을 이뤄야 하므로 홀수 길이는 false 반환
			return false;
		}
		else if(pair.length == 0){														// 아무것도 없는경우 올바른 처리이므로 true 반환
			return true;
		}
		else{			
			for(int i = 0; i < pair.length; i++){
				if(pair[i] != ']' && pair[i] != '}' && pair[i] != ')'){				// '], }, )'의 경우 스택에 담지 않고 스택내의 값과 비교하기 위해 쓰임
					parentheses.push(pair[i]);
				}
				else{																			// 반대의 경우
                    if(!chk[i]){																// 방문을 하지 않은 괄호라면, 방문한것으로 처리 후
                        chk[i] = true;
                        i--;																	// 인덱스를 앞으로 한칸 땡김
                    }
                }
				
				char peek = ' ';
                
				if(!parentheses.empty()){											// 스택에 어떤 값이 있는 경우에만 꼭대기 값을 가져와 peek 변수에 할당
					peek = parentheses.peek();
				}
				
				if(i < pair.length - 1){
					if((peek == '[' && pair[i + 1] == ']') || (peek == '{' && pair[i + 1] == '}') || (peek == '(' && pair[i + 1] == ')')){	
						parentheses.pop();											// 스택 꼭대기 값과 다음 배열내의 값을 비교해서 올바른 괄호처리가 된다면 꼭대기 값을 스택에서 제거하고
						i++;																	// 인덱스를 한칸 뒤로 미루어 다음 값부터 다시 비교를 시작함
					}
				}
			}
		}
		
		if(parentheses.empty()){			// 괄호를 올바르게 쳐놓은 경우 스택이 비게되므로
			return true;							// true 반환
		}
		else{
			return false;							// 아닌 경우 false 반환
		}
	}
}

// 출처 LeetCode Valid Parentheses discuss

//		public boolean isValid(String s) {
//			Stack<Character> stack = new Stack<Character>();
//			for (char c : s.toCharArray()) {
//				if (c == '(')
//					stack.push(')');
//				else if (c == '{')
//					stack.push('}');
//				else if (c == '[')
//					stack.push(']');
//				else if (stack.isEmpty() || stack.pop() != c)
//					return false;
//			}
//			return stack.isEmpty();
//		}
