/**
 * Created by romag_000 on 13/03/2016.
 */
public class Const extends AbstractExpression {
    private final double value;
    Const(double value) {this.value = value;}
    public double evaluate(double v) {
        return value;
    }
}
