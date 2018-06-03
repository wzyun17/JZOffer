/**
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * @author User
 * ˼·�������ݣ�10^13��1101�� = 10^0001*10^0100*10^1000��
 * ���������
 * 1.����Ϊ0��ָ��Ϊ�������ش���
 * 2.������Ϊ0��ָ��Ϊ����������ص�����
 * 3.ָ��Ϊ0������1
 * 4.��Ϊ��
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
    		if(base<0) throw new RuntimeException("���ܶ�Ϊ����");
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
