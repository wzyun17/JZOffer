/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 思路：
 * 转换成char数组，或直接通过工具类做
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
