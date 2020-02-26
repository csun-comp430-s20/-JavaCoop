public class PrivateToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof PrivateToken;
    }
}