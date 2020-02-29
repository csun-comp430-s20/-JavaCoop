public class GreaterThanToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof GreaterThanToken;
    }
}