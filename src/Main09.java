/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * @author User
 * ˼·��f(n) = 2*f(n-1) 
 * �����õ��ǵݹ飬���ǣ�����λ����ѭ�����ã�ʡ�ռ�ʱ��
 */
public class Main09 {

	public static void main(String[] args) {

	}

}

class Solution09 {
    public int JumpFloorII(int target) {
        if(target<=1) return 1;
        return JumpFloorII(target-1)*2;
    }
}
