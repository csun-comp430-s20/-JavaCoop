package code;
public class IncrementToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof IncrementToken;
    }
}