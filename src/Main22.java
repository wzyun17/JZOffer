/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @author User
 * ˼·����������������ö���ģ��
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main22 {
	public static void main(String[] args) {
		
		
	}
}

class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	//return����list��������null
    	if(root == null) return list;
    	q.offer(root);
    	while(!q.isEmpty()) {
    		TreeNode temp = q.poll();
    		if(temp.left!= null)
    		q.offer(temp.left);
    		if(temp.right!= null)
    		q.offer(temp.right);
    		list.add(temp.val);
    	}
    	
		return list;
    }
}
