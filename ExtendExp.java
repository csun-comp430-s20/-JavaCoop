
public class ExtendExp implements Exp{
public final Exp class1;
public final Exp class2;

public ExtendExp(final Exp class1,
             final Exp class2) {
    this.class1 = class1;
    this.class2 = class2;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((class1 == null) ? 0 : class1.hashCode());
	result = prime * result + ((class2 == null) ? 0 : class2.hashCode());
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
	ExtendExp other = (ExtendExp) obj;
	if (class1 == null) {
		if (other.class1 != null)
			return false;
	} else if (!class1.equals(other.class1))
		return false;
	if (class2 == null) {
		if (other.class2 != null)
			return false;
	} else if (!class2.equals(other.class2))
		return false;
	return true;
}
}
