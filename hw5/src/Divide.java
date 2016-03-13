/**
 * Created by romag_000 on 13/03/2016.
 */
public class Divide extends BinaryOperation {
    private AbstractExpression left;
    private AbstractExpression right;
    Divide(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
