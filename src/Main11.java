/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author User
 * 
 * 思路：用移位运算符，或用n和（n-1）做与运算，能做多少次就有多少个1
 */
public class Main11 {

	public static void main(String[] args) {
		//System.out.println(new Solution11().NumberOf1(-1)
		System.out.println(11&12);//没有11&&12这种用法
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
