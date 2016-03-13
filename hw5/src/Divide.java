/**
 * Created by romag_000 on 13/03/2016.
 */
public class Divide extends BinaryOperation {
    Divide(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }
    public double OperationImpl(double x, double y) { return x / y; }
}
