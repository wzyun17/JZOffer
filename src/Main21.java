/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * @author User
 * ˼·����������ջ��ģ��������̡�
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
