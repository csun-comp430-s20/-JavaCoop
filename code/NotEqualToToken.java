package code;
public class NotEqualToToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof NotEqualToToken;
    }
}