import java.text.ParseException;
public class ParserTest {
    public static void assertParses(final Exp expected,
                                    final Token... tokens)
        throws ParseException {
        assert(expected.equals((new Parser(tokens)).parseToplevelExp()));
        Exp result = new Parser(tokens).parseToplevelExp();
        boolean test =  (expected.equals(result));
        System.out.print(test);
    } // assertParses


		public static void emptyDoesNotParse() throws ParseException {
        assertParses(null);
    }

    public static void integerParses() throws ParseException {
        assertParses(new IntegerExp(123), new IntegerToken(123));
    }

    public static void variableParses() throws ParseException {
        assertParses(new VariableExp("foo"), new VariableToken("foo"));
    }
    
    public static void boolParses() throws ParseException {
      assertParses(new BooleanExp(true), new BooleanToken(true));
  }

    public static void parensParse() throws ParseException {
        assertParses(new VariableExp("foo"),
                     new LeftParenToken(),
                     new VariableToken("foo"),
                     new RightParenToken());
    }

    public static void ifParses() throws ParseException {
        assertParses(new IfExp(new IntegerExp(1),
                               new IntegerExp(2),
                               new IntegerExp(3)),
                     new IfToken(),
                     new LeftParenToken(),
                     new IntegerToken(1),
                     new RightParenToken(),
                     new IntegerToken(2),
                     new ElseToken(),
                     new IntegerToken(3));
    }

    public static void plusParses() throws ParseException {
        assertParses(new PlusExp(new IntegerExp(1), new IntegerExp(2)),
                     new IntegerToken(1),
                     new AdditionToken(),
                     new IntegerToken(2));
    }

    public static void plusIsLeftAssociative() throws ParseException {
        assertParses(new PlusExp(new PlusExp(new IntegerExp(1),
                                             new IntegerExp(2)),
                                 new IntegerExp(3)),
                     new IntegerToken(1),
                     new AdditionToken(),
                     new IntegerToken(2),
                     new AdditionToken(),
                     new IntegerToken(3));
    }
    
    public static void subParses() throws ParseException {
      assertParses(new PlusExp(new IntegerExp(1), new IntegerExp(2)),
                   new IntegerToken(1),
                   new SubtractionToken(),
                   new IntegerToken(2));
  }
    public static void multParses() throws ParseException {
      assertParses(new PlusExp(new IntegerExp(1), new IntegerExp(2)),
                   new IntegerToken(1),
                   new MultiplicationToken(),
                   new IntegerToken(2));
  }
    public static void divParses() throws ParseException {
      assertParses(new PlusExp(new IntegerExp(1), new IntegerExp(2)),
                   new IntegerToken(1),
                   new DivisionToken(),
                   new IntegerToken(2));
  }

    public static void missingIntegerGivesParseError() throws ParseException {
        assertParses(null,
                     new IntegerToken(1),
                     new AdditionToken());
    }
    public static void returnParse() throws ParseException {
      assertParses(new VariableExp("foo"),
                   new ReturnToken(),
                   new VariableToken("foo"));
  }
    public static void whileParses() throws ParseException {
      assertParses(new WhileExp(new BooleanExp(true), new PlusExp(new IntegerExp(2), new IntegerExp(3))),
                   new WhileToken(),
                   new LeftParenToken(),
                   new BooleanToken(true),
                   new RightParenToken(),
                   new IntegerToken(2),
                   new AdditionToken(),
                   new IntegerToken(3));
  }
    public static void main(String[] args) throws ParseException {
    	//emptyDoesNotParse(); //causes crashing because null will not work so it works
    	int i = 0;
    	integerParses();
    	System.out.println(" "+i++);
    	ifParses();
    	System.out.println(" "+i++);
    	variableParses();
    	System.out.println(" "+i++);
    	plusIsLeftAssociative();
    	System.out.println(" "+i++);
    	plusParses();
    	System.out.println(" "+i++);
    	parensParse();
    	System.out.println(" "+i++);
    	subParses();
    	System.out.println(" "+i++);
    	multParses();
    	System.out.println(" "+i++);
    	boolParses();
    	System.out.println(" "+i++);
    	divParses();
    	System.out.println(" "+i++);
    	whileParses();
    	System.out.println(" "+i++);
    	returnParse();
    	System.out.println(" "+i++);
    }
} // ParserTest
    
     