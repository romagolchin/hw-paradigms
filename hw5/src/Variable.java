/**
 * Created by romag_000 on 13/03/2016.
 */
public class Variable extends AbstractExpression {
    String var;
    Variable(String var) {
        this.var = var;
    }
    public String representation() {return var;}
}
