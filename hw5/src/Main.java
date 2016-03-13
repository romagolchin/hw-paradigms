/**
 * Created by romag_000 on 13/03/2016.
 */
public class Main {
    public static void main(String args[]) {
        Variable x = new Variable("x");
        System.out.println(new Add(new Subtract(new Multiply(x, x), new Multiply(new Const(2), x)), new Const(1)));
    }
}
