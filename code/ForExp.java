package code;
public class ForExp implements Exp {
	public final Exp init;
	public final Exp cond;
	public final Exp inc;
  public final Exp execute;

  public ForExp(final Exp init, final Exp cond, final Exp inc,
               final Exp execute) {
  	  this.init = init;
      this.cond = cond;
      this.execute = execute;
      this.inc = inc;
  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cond == null) ? 0 : cond.hashCode());
		result = prime * result + ((execute == null) ? 0 : execute.hashCode());
		result = prime * result + ((inc == null) ? 0 : inc.hashCode());
		result = prime * result + ((init == null) ? 0 : init.hashCode());
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
		ForExp other = (ForExp) obj;
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
		if (inc == null) {
			if (other.inc != null)
				return false;
		} else if (!inc.equals(other.inc))
			return false;
		if (init == null) {
			if (other.init != null)
				return false;
		} else if (!init.equals(other.init))
			return false;
		return true;
	}
}
