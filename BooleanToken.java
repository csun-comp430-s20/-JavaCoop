public class BooleanToken implements Token {
	public final boolean value;

  public BooleanToken(final boolean value) {
      this.value = value;
  }
    public boolean equals(final Object other) {
        return other instanceof BooleanToken;
    }
}