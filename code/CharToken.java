package code;
public class CharToken implements Token {
	public final char value;

  public CharToken(final char value) {
      this.value = value;
  }
    public boolean equals(final Object other) {
        return other instanceof CharToken;
    }
}