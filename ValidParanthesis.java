package problems;

import java.util.Stack;

/**
 * @author nikhil bansal
 * {@code Program to check if input Sting is a sequence of Valid Paranthesis or not }
 * {@link https://www.educative.io/edpresso/the-valid-parentheses-problem}
 *
 */
public class ValidParanthesis {
	
	static void validParanthesis(String str) {
		
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		Stack<Character> stack = new Stack<Character>();
		char[] charArray = str.toCharArray();

		for(char ch :charArray) {

			if( (ch == '[') 
					|| (ch == '{') 
					|| (ch == '(') ) { // push to stack in case of open brackets
				stack.push(ch);
			}else {
				if(stack.isEmpty()) { //If closing bracket is encountered but stack is already empty. 
									// This means its Invalid.
					System.out.println("Invalid Paranthesis - 1");
					return;
				}else {
					char top = stack.peek();
					if( top == '[' && ch == ']' || 
							top == '{' && ch == '}' ||
							top == '(' && ch == ')' ) {
						stack.pop();
					}else { 
						System.out.println("Invalid Paranthesis - 2");
						return;
					}

				}
			}

		}
		if(stack.isEmpty()) {
			System.out.println("Valid Paranthesis");
		}else {
			System.out.println("Invalid Paranthesis - 3");
		}
	}

	public static void main(String[] args) {

		String input_str = ")";
		validParanthesis(input_str);

	}

}
