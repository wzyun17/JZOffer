/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * ˼·��
 * ת����char���飬��ֱ��ͨ����������
 */
public class Main02 {

	public static void main(String[] args) {
		
	}
	
    public String replaceSpace(StringBuffer str) {
    	char[] a = str.toString().toCharArray();
    	StringBuffer s =new StringBuffer();
    	for(char c:a) {
    		if(c == ' ') s.append("%20");
    		else s.append(c);
    	}
    	return s.toString();
    }

}
