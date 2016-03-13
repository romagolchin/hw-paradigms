/**
 * Created by romag_000 on 13/03/2016.
 */
public class Const implements Expression {
    private final int value;
    Const(int value) {this.value = value;}
    private String representation() {
        return Integer.toString(value);
    }
    public int evaluate(int v) {
        return value;
    }
}
