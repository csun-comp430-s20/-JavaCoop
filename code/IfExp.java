package code;
// sealed trait Exp
// case class IfExp(e1: Exp, e2: Exp, e3: Exp) extends Exp
public class IfExp implements Exp {
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((falseBranch == null) ? 0 : falseBranch.hashCode());
		result = prime * result + ((guard == null) ? 0 : guard.hashCode());
		result = prime * result + ((trueBranch == null) ? 0 : trueBranch.hashCode());
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
		IfExp other = (IfExp) obj;
		if (falseBranch == null) {
			if (other.falseBranch != null)
				return false;
		} else if (!falseBranch.equals(other.falseBranch))
			return false;
		if (guard == null) {
			if (other.guard != null)
				return false;
		} else if (!guard.equals(other.guard))
			return false;
		if (trueBranch == null) {
			if (other.trueBranch != null)
				return false;
		} else if (!trueBranch.equals(other.trueBranch))
			return false;
		return true;
	}

		public final Exp guard;
    public final Exp trueBranch;
    public final Exp falseBranch;

    public IfExp(final Exp guard,
                 final Exp trueBranch,
                 final Exp falseBranch) {
        this.guard = guard;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }
}
