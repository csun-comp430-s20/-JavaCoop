package code;
public class LogicalANDToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof LogicalANDToken;
    }
}