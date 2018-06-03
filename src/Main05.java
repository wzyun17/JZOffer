/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author User
 * 进栈stack1，出栈，若stack2中无数据，将stack1中出栈后进栈stack2，将stack2中出栈完。
 * 
 * 错误：判断stack中有无数据要用isEmpty 返回的boolean要判断是否和要的一样，或是相反，if（isEmpty（））意思是
 * 			为空。。
 */
import java.util.Stack;
public class Main05 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.push(1);
		solution.push(2);
		solution.push(3);
		System.out.println(solution.pop());
		System.out.println(solution.pop());
		solution.push(4);
		solution.push(5);
		System.out.println(solution.pop());
		System.out.println(solution.pop());
		System.out.println(solution.pop());
	}

}



class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if (!stack2.isEmpty()) {
        	return stack2.pop();
        }
        else {
        	while(!stack1.isEmpty()) {
        		stack2.push(stack1.pop());
        	}
        	return stack2.pop();
        }
    }
}
