package code;
public class PrintToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof PrintToken;
    }
}