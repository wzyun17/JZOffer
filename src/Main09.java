/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author User
 * 思路：f(n) = 2*f(n-1) 
 * 下面用的是递归，但是！！移位或者循环更好，省空间时间
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
