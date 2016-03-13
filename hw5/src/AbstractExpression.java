import java.util.Scanner;
import java.util.Stack;


/**
 * Created by romag_000 on 13/03/2016.
 */
public abstract class AbstractExpression {
    protected abstract String representation();

    public int evaluate(int value) {
        String s = this.representation();
        Scanner sc = new Scanner(s);
        Stack<Integer> stack = new Stack<>();
        while (sc.hasNext()) {
            String token = sc.next();
            if(Character.isLetter(token.charAt(0)))
                stack.push(value);
            else if(Character.isDigit(token.charAt(0)))
                stack.push(Integer.parseInt(token));
            else {
                int leftOperand = stack.pop();
                int rightOperand = stack.pop();
                if(token.charAt(0) == '+')
                    stack.push(leftOperand + rightOperand);
                if(token.charAt(0) == '-')
                    stack.push(leftOperand - rightOperand);
                if(token.charAt(0) == '*')
                    stack.push(leftOperand * rightOperand);
                if(token.charAt(0) == '/')
                    stack.push(leftOperand / rightOperand);
            }
        }
        return stack.pop();
    }
}
