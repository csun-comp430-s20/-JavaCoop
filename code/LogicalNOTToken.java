package code;
public class LogicalNOTToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof LogicalNOTToken;
    }
}