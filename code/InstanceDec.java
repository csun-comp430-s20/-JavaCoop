package code;
public class InstanceDec implements Exp{
	public final Token access;
	public final Type type;
	public final VariableExp name;

  public InstanceDec(final Token access,final Type type, final VariableExp name) {
  	this.access = access;
  	this.type = type;
  	this.name = name;
  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((access == null) ? 0 : access.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		InstanceDec other = (InstanceDec) obj;
		if (access == null) {
			if (other.access != null)
				return false;
		} else if (!access.equals(other.access))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
				return true;
	}
}
