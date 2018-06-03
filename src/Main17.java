/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author User
 * 思路：先判断根节点，然后再判断左右子树，灵活运用递归。
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


