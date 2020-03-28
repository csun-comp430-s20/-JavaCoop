package code;
public class DecrementToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof DecrementToken;
    }
}