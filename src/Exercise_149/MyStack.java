package Exercise_149;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	Queue<Integer> q1;
	Queue<Integer> q2;

	public MyStack() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int x) {
		q1.offer(x);
	}

	public int pop() {
		while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int result = q1.poll();
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return result;
	}

	public int top() {
		while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int result = q1.poll();
        q2.offer(result);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return result;
	}

	public boolean empty() {
		return q1.isEmpty() && q2.isEmpty();
	}

}
