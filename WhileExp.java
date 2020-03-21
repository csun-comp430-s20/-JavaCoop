
public class WhileExp implements Exp{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cond == null) ? 0 : cond.hashCode());
		result = prime * result + ((execute == null) ? 0 : execute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WhileExp other = (WhileExp) obj;
		if (cond == null) {
			if (other.cond != null)
				return false;
		} else if (!cond.equals(other.cond))
			return false;
		if (execute == null) {
			if (other.execute != null)
				return false;
		} else if (!execute.equals(other.execute))
			return false;
		return true;
	}

	public final Exp cond;
  public final Exp execute;

  public WhileExp(final Exp cond,
               final Exp execute) {
      this.cond = cond;
      this.execute = execute;
  }
}
