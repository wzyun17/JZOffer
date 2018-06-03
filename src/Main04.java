/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ�������������
 * @author User
 * ˼·��ͨ��ǰ��ȷ�������е��м���λ�ã��ݹ���⡣
 */
public class Main04 {

	public static void main(String[] args) {
		int [] pre = {1,2,3,4,5,6,7};
		int [] in = {3,2,4,1,6,5,7};
		reConstructBinaryTree(pre,in);
	}
	
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	 if(in.length == 0) return null;
         TreeNode result = new TreeNode(pre[0]);
         int i = 0;
         while(in[i] != pre[0]) i++;
         
         int [] pre_left = new int[i];
         for(int j = 0;j<i;j++) pre_left[j] = pre[j+1];
         
         int [] pre_right = new int[pre.length-1-i];
         for(int j = 0;j<pre.length-1-i;j++) pre_right[j] = pre[i+j+1];
         
         int [] in_left = new int[i];
         for(int j = 0;j<i;j++) in_left[j] = in[j];
         
         int [] in_right = new int[in.length-1-i];
         for(int j = 0;j<pre.length-1-i;j++) in_right[j] = in[i+j+1];
         
         result.left = reConstructBinaryTree(pre_left, in_left);
         result.right = reConstructBinaryTree(pre_right, in_right);
         return result;
         
    }
}
    


 


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

