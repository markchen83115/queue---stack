import java.util.Arrays;
import java.util.Stack;

public class Queue1 {
    Stack<Integer> stack = new Stack<>();
    int num = 0;
    
    public void add(int n) {
        Stack<Integer> tmpStack = new Stack<>();
        while (!stack.isEmpty()) {
            tmpStack.push(stack.pop());
        }
        stack.push(n);
        num++;
        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }

    public int poll() {
        return stack.pop();
    }

    public void show() {
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
