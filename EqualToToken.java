public class EqualToToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof EqualToToken;
    }
}