/**
 * ��Ŀ����
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 * @author User
 * ˼·��ע��root Ϊnull�����������
 * 
 */
public class Main18 {

	public static void main(String[] args) {

	}

}

class Solution18 {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        TreeNode temp = null;
        temp = root.left;
        root.left  = root.right;
        root.right = temp;
        if(root.left != null)
        Mirror(root.left);
        if(root.right != null)
        Mirror(root.right);
    }
}