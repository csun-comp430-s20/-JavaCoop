<<<<<<< HEAD
package codegen_example.syntax;

=======
package code;
>>>>>>> dc478b3aa95f37d08bf586d6adea2f4c7511f95b
public class ClassName {
    public final String name;

    public ClassName(final String name) {
        this.name = name;
    }

    @Override
<<<<<<< HEAD
=======
    public boolean equals(final Object other) {
        return (other instanceof ClassName &&
                ((ClassName)other).name.equals(name));
    }

    @Override
>>>>>>> dc478b3aa95f37d08bf586d6adea2f4c7511f95b
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
<<<<<<< HEAD

    @Override
    public boolean equals(final Object other) {
        return (other instanceof ClassName &&
                name.equals(((ClassName)other).name));
    }
} // ClassName
=======
} // ClassName
>>>>>>> dc478b3aa95f37d08bf586d6adea2f4c7511f95b
