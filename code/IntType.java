package code;

public class IntType implements Type {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof IntType;
    }

    @Override
    public String toString() {
        return "int";
    }

    public String toDescriptorString() {
        return "I";
    }
} // IntType
