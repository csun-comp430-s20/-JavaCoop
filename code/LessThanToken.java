package code;
public class LessThanToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof LessThanToken;
    }
}