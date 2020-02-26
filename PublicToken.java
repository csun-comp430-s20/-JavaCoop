public class PublicToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof PublicToken;
    }
}