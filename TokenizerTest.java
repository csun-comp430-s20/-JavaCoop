import java.util.ArrayList;
import java.util.List;

public class TokenizerTest {
    public static void testTokenizes(final String input,
                                     final Token... expectedTokens) throws TokenizerException {
        final List<Token> expected = new ArrayList<Token>();
        for (final Token token : expectedTokens) {
            expected.add(token);
        }
        final Tokenizer tokenizer = new Tokenizer(input);
        final List<Token> receivedTokens = tokenizer.tokenize();
        assert(receivedTokens.equals(expected));
    }
    
    // input: "("
    // output: LeftParenToken
    public static void testLeftParen() throws TokenizerException {
        testTokenizes("(", new LeftParenToken());
    }

    // input: ")"
    // output: RightParenToken
    public static void testRightParen() throws TokenizerException {
        testTokenizes(")", new RightParenToken());
    }

    public static void testVariableAlone() throws TokenizerException {
        testTokenizes("x", new VariableToken("x"));
    }

    public static void testVariableWithWhitespaceBefore() throws TokenizerException {
        testTokenizes(" x", new VariableToken("x"));
    }

    public static void testVariableWithWhitespaceAfter() throws TokenizerException {
        testTokenizes("x ", new VariableToken("x"));
    }

    public static void testVariableContainingReservedWords() throws TokenizerException {
        testTokenizes("ifelse", new VariableToken("ifelse"));
    }
    
    public static void testPrint() throws TokenizerException {
      testTokenizes("print", new PrintToken());
  }
    public static void testString() throws TokenizerException {
      testTokenizes("String", new StringToken());
  }
    public static void testVoid() throws TokenizerException {
      testTokenizes("void", new VoidToken());
  }
    public static void testClass() throws TokenizerException {
      testTokenizes("Class", new ClassToken());
  }
    public static void testBoolean() throws TokenizerException {
      testTokenizes("boolean", new BooleanToken());
  }
    public static void testThis() throws TokenizerException {
      testTokenizes("this", new ThisToken());
  }
    public static void testFor() throws TokenizerException {
      testTokenizes("for", new ForToken());
  }
    public static void testWhile() throws TokenizerException {
      testTokenizes("while", new WhileToken());
  }
    public static void testBreak() throws TokenizerException {
      testTokenizes("break", new BreakToken());
  }
    public static void testReturn() throws TokenizerException {
      testTokenizes("return", new ReturnToken());
  }
    public static void testPublic() throws TokenizerException {
      testTokenizes("public", new PublicToken());
  }
    public static void testProtected() throws TokenizerException {
      testTokenizes("protected", new ProtectedToken());
  }
    public static void testPrivate() throws TokenizerException {
      testTokenizes("private", new PrivateToken());
  }
  public static void testAddition() throws TokenizerException {
    testTokenizes("+", new AdditionToken());
}
public static void testSubtraction() throws TokenizerException {
  testTokenizes("-", new SubtractionToken());
}
public static void testMultiplication() throws TokenizerException {
  testTokenizes("*", new MultiplicationToken());
}
public static void testDivision() throws TokenizerException {
  testTokenizes("/", new DivisionToken());
}
public static void testEqualTo() throws TokenizerException {
  testTokenizes("==", new EqualToToken());
}
public static void testNotEqualTo() throws TokenizerException {
  testTokenizes("!=", new NotEqualToToken());
}
public static void testGreaterThan() throws TokenizerException {
  testTokenizes(">", new GreaterThanToken());
}
public static void testGreaterThanEqualTo() throws TokenizerException {
  testTokenizes(">=", new GreaterThanEqualToToken());
}
public static void testLessThan() throws TokenizerException {
  testTokenizes("<", new LessThanToken());
}
public static void testLessThanEqualTo() throws TokenizerException {
  testTokenizes("<=", new LessThanEqualToToken());
}
public static void testAND() throws TokenizerException {
  testTokenizes("&&", new LogicalANDToken());
}
public static void testOR() throws TokenizerException {
  testTokenizes("||", new LogicalORToken());
}
public static void testNOT() throws TokenizerException {
  testTokenizes("!", new LogicalNOTToken());
}
public static void testEQUAL() throws TokenizerException {
  testTokenizes("=", new EqualToken());
}

public static void testIncrement() throws TokenizerException {
  testTokenizes("++", new IncrementToken());
}
public static void testDecrement() throws TokenizerException {
  testTokenizes("--", new DecrementToken());
}
    public static void testTwoReservedWords() throws TokenizerException {
        testTokenizes("if else",
                      new IfToken(),
                      new ElseToken());
    }
    
    public static void main(String[] args) throws TokenizerException {
        testLeftParen();
        testRightParen();
        testVariableAlone();
        testVariableWithWhitespaceBefore();
        testVariableWithWhitespaceAfter();
        testVariableContainingReservedWords();
        testPrint();
        testString();
        testVoid();
        testClass();
        testBoolean();
        testThis();
        testFor();
        testWhile();
        testBreak();
        testReturn();
        testPublic();
        testPrivate();
        testProtected();
        testTwoReservedWords();
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testEqualTo();
        testNotEqualTo();
        testGreaterThan();
        testGreaterThanEqualTo();
        testLessThan();
        testLessThanEqualTo();
        testAND();
        testOR();
        testNOT();
        testEQUAL();
        testIncrement();
        testDecrement();
    }
}

        
