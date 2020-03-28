package code;
public class QuotationToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof QuotationToken;
    }
}