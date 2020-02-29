public class GreaterThanEqualToToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof GreaterThanEqualToToken;
    }
}