package code;
import java.lang.instrument.ClassDefinition;
import java.util.List;

public class Program {
    final ClassDefinition[] classDefsarr;
    final List<FirstOrderFunctionDefinition> classDefs;
		public FirstOrderFunctionDefinition[] functions;
    public Program(final List<FirstOrderFunctionDefinition> list) {
        this.classDefs = list;
        classDefsarr = null;
    }
}
