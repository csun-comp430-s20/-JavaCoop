package code;
public class LessThanEqualToToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof LessThanEqualToToken;
    }
}