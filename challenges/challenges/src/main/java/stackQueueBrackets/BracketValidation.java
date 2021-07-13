package stackQueueBrackets;

import stackAndQueue.Node;
import stackAndQueue.Queue;
import stackAndQueue.Stack;

public class BracketValidation {

  public boolean validateBrackets(String string) {

      Stack<Character> stack = new Stack<>();

    char[] array = string.toCharArray();

    for (char chr : array) {
      if ("(){}[]".contains("" + chr)){
        if ("({[".contains("" + chr)){
          stack.push(chr);
        }else if(
          (chr == ')' && stack.peek().equals("(")) ||
          (chr == ']' && stack.peek().equals("[")) ||
          (chr == '}' && stack.peek().equals("{"))
        ){
            stack.pop();
        }
      }
    }
    return stack.isEmpty();
  }
}
