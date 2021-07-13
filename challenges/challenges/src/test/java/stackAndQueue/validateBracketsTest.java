package stackAndQueue;

import org.junit.Test;
import stackQueueBrackets.BracketValidation;

import static org.junit.Assert.*;

public class validateBracketsTest {
  @Test
  public void BracketsTest(){
    BracketValidation bracketValidation = new BracketValidation();

    assertTrue(bracketValidation.validateBrackets("{}"));
    assertTrue(bracketValidation.validateBrackets("{}(){}"));
    assertTrue(bracketValidation.validateBrackets("()[[Extra Characters]]"));
    assertTrue(bracketValidation.validateBrackets("(){}[[]]"));
    assertTrue(bracketValidation.validateBrackets("(){}[[]]"));
    assertTrue(bracketValidation.validateBrackets("{}{Code}[Fellows](())"));

    assertFalse(bracketValidation.validateBrackets("[({}]"));
    assertFalse(bracketValidation.validateBrackets("(]("));
    assertFalse(bracketValidation.validateBrackets("{(})"));
  }
}
