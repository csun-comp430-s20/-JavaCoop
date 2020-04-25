package code;
import java.util.List;

public class WhileStmt implements Stmt {
    public final Stmt initializer = null;
		public final Stmt update = null;
		public final Exp guard;
    public final List<Stmt> body;

    public WhileStmt(final Exp guard,
                   final List<Stmt> body) {
        this.guard = guard;
        this.body = body;
    }
}
