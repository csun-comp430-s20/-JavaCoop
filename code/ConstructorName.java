package code;
public class ConstructorName {
    public final String name;

    public ConstructorName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object other) {
        return (other instanceof ConstructorName &&
                ((ConstructorName)other).name.equals(name));
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
} // ConstructorName