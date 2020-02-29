public class LogicalORToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof LogicalORToken;
    }
}