public class EqualToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof EqualToken;
    }
}