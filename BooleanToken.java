public class BooleanToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof BooleanToken;
    }
}