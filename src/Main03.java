import java.util.ArrayList;

/**
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 * @author User
 * ˼·���ݹ飬����β��ʱ��ſ�ʼ���ش�ӡ
 */
public class Main03 {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public static void main(String[] args) {

	}

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	
    	if(listNode != null) {
    		printListFromTailToHead(listNode.next);
    		arrayList.add(listNode.val);
    	}    	
		return arrayList;
        
    }
}


class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }