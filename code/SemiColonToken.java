package code;
public class SemiColonToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof SemiColonToken;
    }
}