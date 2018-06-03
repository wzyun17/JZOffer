/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author User
 * ��ջstack1����ջ����stack2�������ݣ���stack1�г�ջ���ջstack2����stack2�г�ջ�ꡣ
 * 
 * �����ж�stack����������Ҫ��isEmpty ���ص�booleanҪ�ж��Ƿ��Ҫ��һ���������෴��if��isEmpty��������˼��
 * 			Ϊ�ա���
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
