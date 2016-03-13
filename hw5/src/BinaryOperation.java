/**
 * Created by romag_000 on 13/03/2016.
 */
public abstract class BinaryOperation extends AbstractExpression {
    protected AbstractExpression left, right;
    BinaryOperation(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
    protected abstract double OperationImpl(double x, double y);
    protected AbstractExpression getLeft() {return this.left;}
    protected AbstractExpression getRight() {return this.right;}
    public double evaluate(double value) {
        return OperationImpl(this.getLeft().evaluate(value), this.getRight().evaluate(value));
    }
}
