package code;
public class ReturnToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof ReturnToken;
    }
}