/**
 * 1.在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * 思路： 从左下角开始，比他大右移，比他小上移
 */
public class Main01 {

	public static void main(String[] args) {
		
		int [][] a = {{}};
		System.out.println(Find(16,a));
	}
	
    public static boolean Find(int target, int [][] array) {
    	//如果数组中没有数
    	if(array.length==0||array[0].length==0) return false;
    	//如果target的值不在数组的最小值与最大值之间，return false
    	if(array[0][0]>target||array[array.length-1][array[0].length-1]<target) return false;
    	int rowcount=array.length;
    	int colunmcount=array[0].length;
    	for(int i = rowcount-1,j = 0;i>=0;i--) {
    		for(;j<colunmcount;j++) {
    			if(array[i][j]==target) return true;
    			if(array[i][j]<target) continue;
    			if(array[i][j]>target) break;
    		}
    	}    	
		return false;

    }
    
    

}
