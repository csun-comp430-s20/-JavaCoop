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
      testTokenizes("Print", new PrintToken());
      System.out.println("print tokenizes");
  }
    public static void testString() throws TokenizerException {
      testTokenizes("String", new StringToken());
      System.out.println("print tokenizes");
  }
    public static void testVoid() throws TokenizerException {
      testTokenizes("void", new VoidToken());
      System.out.println("print tokenizes");
  }
    public static void testClass() throws TokenizerException {
      testTokenizes("Class", new ClassToken());
      System.out.println("print tokenizes");
  }
    public static void testBoolean() throws TokenizerException {
      testTokenizes("boolean", new BooleanToken());
      System.out.println("print tokenizes");
  }
    public static void testThis() throws TokenizerException {
      testTokenizes("this", new ThisToken());
      System.out.println("print tokenizes");
  }
    public static void testFor() throws TokenizerException {
      testTokenizes("for", new ForToken());
      System.out.println("print tokenizes");
  }
    public static void testWhile() throws TokenizerException {
      testTokenizes("while", new WhileToken());
      System.out.println("print tokenizes");
  }
    public static void testBreak() throws TokenizerException {
      testTokenizes("break", new BreakToken());
      System.out.println("print tokenizes");
  }
    public static void testReturn() throws TokenizerException {
      testTokenizes("return", new ReturnToken());
      System.out.println("print tokenizes");
  }
    public static void testPublic() throws TokenizerException {
      testTokenizes("public", new PublicToken());
      System.out.println("print tokenizes");
  }
    public static void testProtected() throws TokenizerException {
      testTokenizes("protected", new ProtectedToken());
      System.out.println("print tokenizes");
  }
    public static void testPrivate() throws TokenizerException {
      testTokenizes("private", new PrivateToken());
      System.out.println("print tokenizes");
  }
    public static void testChar() throws TokenizerException {
      testTokenizes("a", new CharToken());
      System.out.println("print tokenizes");
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
        testChar();
        testTwoReservedWords();
    }
}

        
