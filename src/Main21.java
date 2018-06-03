/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * @author User
 * 思路：借助辅助栈，模拟这个过程。
 */
import java.util.ArrayList;
import java.util.Stack;

public class Main21 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		System.out.println(s.peek());
	}

}
class Solution21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> s = new Stack<Integer>();
    	for(int i = 0,j=0;i<pushA.length;i++) {
    		s.push(pushA[i]);
    		while(!s.empty()&&s.peek()==popA[j]) {
    			s.pop();
    			j++;
    		}
    	}
    	if(s.isEmpty()) return true;
    	
		return false;
      
    }
}
