package STACK_QUEUE;

import java.util.Stack;

public class Check_parentheses {

	boolean solution(String s) {

		Stack<Character> stack = new Stack();

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);

			if(ch == '('){
				stack.push(ch);
			} else{

				if (stack.isEmpty()) return false;

				stack.pop();

			}
		}

		boolean answer = (stack.isEmpty()) ? true : false;


		return answer;
	}

}
