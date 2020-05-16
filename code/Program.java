package code;

import java.util.List;

public class Program {
    public final List<FirstOrderFunctionDefinition> functions;
    public final List<ClassDefinition> classDefs;
    
    public Program(final List<FirstOrderFunctionDefinition> functions,final List<ClassDefinition> classDefs) {
        this.classDefs = classDefs;
        this.functions = functions;    
    }
    
} // Program
