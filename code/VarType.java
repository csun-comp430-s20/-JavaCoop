package code;
public class VarType implements Type {
    public VarType() {}
    
    public boolean equals(final Object other) {
        return other instanceof VarType;
    }
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public String toString() {
        return "var";
    }
}