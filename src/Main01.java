/**
 * 1.��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * 
 * ˼·�� �����½ǿ�ʼ�����������ƣ�����С����
 */
public class Main01 {

	public static void main(String[] args) {
		
		int [][] a = {{}};
		System.out.println(Find(16,a));
	}
	
    public static boolean Find(int target, int [][] array) {
    	//���������û����
    	if(array.length==0||array[0].length==0) return false;
    	//���target��ֵ�����������Сֵ�����ֵ֮�䣬return false
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
