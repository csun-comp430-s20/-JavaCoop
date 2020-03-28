package code;
import java.lang.instrument.ClassDefinition;

public class Program {
    final ClassDefinition[] classDefs;
    
    public Program(final ClassDefinition[] classDefs) {
        this.classDefs = classDefs;
    }
}
