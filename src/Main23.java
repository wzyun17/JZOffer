/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No��
 * �������������������������ֶ�������ͬ��
 * @author User
 * ˼·����������������ߵĶ��ȸ�С���ұ߶��ȸ��󣬺����������һ���Ǹ��ڵ㡣����
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