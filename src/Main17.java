/**
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * @author User
 * ˼·�����жϸ��ڵ㣬Ȼ�����ж�����������������õݹ顣
 * 
 */
public class Main17 {

	public static void main(String[] args) {
		
	}

}



class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	if(root1 == null||root2 == null) {
    		return false;
    	}
    	if(root1.val == root2.val) {
    		if(doesTree1HasTree2(root1,root2)) return true;
    	}
    	if(HasSubtree(root1.left,root2)) return true;
    	if(HasSubtree(root1.right,root2)) return true;

		return false;
        
    }

	private boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if(root2 ==null) return true;
		if(root1 == null) return false;
		if(root1.val != root2.val) return false;
		return doesTree1HasTree2(root1.left,root2.left)&&doesTree1HasTree2(root1.right,root2.right);
		
	}
}


