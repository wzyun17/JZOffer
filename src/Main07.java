/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�n<=39
 * @author User
 * ˼·����ѭ�������õݹ�
 */
public class Main07 {

	public static void main(String[] args) {
		System.out.println(new Solution07().Fibonacci(8));
	}

}

class Solution07 {
    public int Fibonacci(int n) {
    	int pre = 1;
    	int result = 1;
    	int last = 1;
    	if(n == 0) return 0;
    	for(int i = 2;i<n;i++) {
    		result = pre + last;
    		pre = last;
    		last = result;
    	}
		return result;

    }
}
