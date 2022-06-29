import java.util.LinkedList;
import java.util.Queue;

public class Stack1 {
    Queue<Integer> queue = new LinkedList<>();
    int num = 0;
    
    public void push(int n) {
        queue.add(n);
        num++;
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.poll());
        }
        
    }

    public int pop() {
        return queue.poll();
    }
    
    public void show() {
        for (int i : queue) {
            System.out.println(i);
        }
    }
}
