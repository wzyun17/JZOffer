/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author User
 * 思路：用一个栈data保存数据，用另外一个栈min保存依次入栈最小的数
 * 比如，data中依次入栈，5,  4,  3, 8, 10, 11, 12, 1
 *       则min依次入栈，5,  4,  3，no,no, no, no, 1
 * no代表此次不如栈
 * 每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则不如栈。
 */
import java.util.Stack;
public class Main20 {

	public static void main(String[] args) {

	}

}


class Solution20 {

	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	Integer temp = null;
    public void push(int node) {
        if(temp == null) {
        	temp = node;
        	min.push(node);
        } else {
        	if(node<=temp) {	
        		temp = node;
                min.push(node);
            }
        }
        data.push(node);
    }
    
    public void pop() {
    	int num = data.pop();
        if(num == temp) {
        	min.pop();
        	temp = min.peek();
        }
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return min.peek();
    }
}