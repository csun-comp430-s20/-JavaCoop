public class StringToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof StringToken;
    }
}