/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author User
 * 思路：快速幂：10^13（1101） = 10^0001*10^0100*10^1000。
 * 四种情况：
 * 1.底数为0，指数为负，返回错误
 * 2.底数不为0，指数为负，结果返回倒数。
 * 3.指数为0，返回1
 * 4.都为正
 */
public class Main12 {

	public static void main(String[] args) {
		System.out.println(new Solution12().Power(2, 4));
	}
	
}

class Solution12 {
    public double Power(double base, int exponent) {
    	boolean isExponentNegative = false;
    	double result = 1;
    	if(exponent<0) {
    		if(base<0) throw new RuntimeException("不能都为负！");
    		isExponentNegative = true;
    		exponent = 0-exponent;
    	}else if(exponent == 0) {
    		return result;
    	}
    	while(exponent!=0) {
    		if((exponent&1) ==1) result*=base;
    		base*=base;
    		exponent>>>=1;
    	}    	
		return isExponentNegative?1/result:result;
        
  }
}
