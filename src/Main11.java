/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * @author User
 * 
 * ˼·������λ�����������n�ͣ�n-1���������㣬�������ٴξ��ж��ٸ�1
 */
public class Main11 {

	public static void main(String[] args) {
		//System.out.println(new Solution11().NumberOf1(-1)
		System.out.println(11&12);//û��11&&12�����÷�
	}

}
class Solution11 {
    public int NumberOf1(int n) {
    	int result = 0;
    	while(n!=0) {
    		if(n%2 == 1) result++;
    		n = n>>>1;
    	}
    	
		return result;

    }
}
