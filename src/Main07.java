/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * @author User
 * 思路：用循环，别用递归
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
