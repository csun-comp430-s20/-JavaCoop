public class IntegerExp implements Exp {
    public final int value;

    public IntegerExp(final int value) {
        this.value = value;
    }

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + value;
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
			IntegerExp other = (IntegerExp) obj;
			if (value != other.value)
				return false;
			return true;
		}
}
