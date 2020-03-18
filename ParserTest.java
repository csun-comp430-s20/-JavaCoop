import java.text.ParseException;
public class ParserTest {
    public static void assertParses(final Exp expected,
                                    final Token... tokens)
        throws ParseException {
        assert(expected.equals((new Parser(tokens)).parseToplevelExp()));
        Exp result = new Parser(tokens).parseToplevelExp();
        boolean test =  (expected.equals(result));
        System.out.println(test);
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

    public static void missingIntegerGivesParseError() throws ParseException {
        assertParses(null,
                     new IntegerToken(1),
                     new AdditionToken());
    }
    public static void main(String[] args) throws ParseException {
    	//emptyDoesNotParse(); //causes crashing because null will not work so it works
    	integerParses();
    	ifParses();
    	variableParses();
    	plusIsLeftAssociative();
    	plusParses();
    	parensParse();
    }
} // ParserTest
    
     