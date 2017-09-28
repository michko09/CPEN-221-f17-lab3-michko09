import java.util.Stack;

public class bracketCheck {

	public static boolean hasMatchingBrackets(String str) {
		
		Stack<Character> bracketTypes = new Stack<Character>();
		
		// Make the string into a character array 
		String inputString = str;
		char[] charString = inputString.toCharArray();
		
		// Check the elements that are brackets
		// Utilize Stack to add or remove brackets
		for (char i : charString) {
			if (i == '[' || i == '(' || i == '{') {
				bracketTypes.push(i);
			} 
			if (i == ']') {
				if (bracketTypes.peek() == '[') {
					bracketTypes.pop();
				}
			} 
			if (i == ')') {
				if (bracketTypes.peek() == '(') {
					bracketTypes.pop();
				}
			}
			if (i == '}') {
				if (bracketTypes.peek() == '{') {
					bracketTypes.pop();
				}
			}
		}
		
		// If there are no elements in the stack
		// All bracket pairs have been identified
		if (bracketTypes.empty()) {
			return true;
		} else {
			return false;
		}
	}
}