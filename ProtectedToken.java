public class ProtectedToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof ProtectedToken;
    }
}
