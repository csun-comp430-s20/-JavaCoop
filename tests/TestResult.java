package tests;
import code.*;

public class TestResult {
    public final String[] output;
    public final ClassGenerator generator;

    public TestResult(final String[] output,
                      final ClassGenerator generator) {
        this.output = output;
        this.generator = generator;
    }
} // TestResult
