/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * @author User
 * 思路：二叉搜索树，左边的都比根小，右边都比根大，后续遍历最后一个是根节点。。。
 * 
 */
public class Main23 {

	public static void main(String[] args) {
		
	}

}
class Solution23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length  == 0) return false;
    	
    	return judge(sequence,0,sequence.length-1);
    }
    
    public boolean judge(int [] sequence,int start,int end) {
    	
    	if(start>=end) return true;
    	int i = end;
    	while(i>start&&sequence[i-1]>sequence[end]) i--;
    	int j = i - 1;
    	while(j>=start) {
    		if(sequence[j]>sequence[end]) return false;
    		j--;
    	}
		return judge(sequence,start,i-1)&&judge(sequence,i,end-1);
    	
    }
}