/**
 * ����һ��������ת�����������������Ԫ�ء�
 * @author User
 * ˼·��������ָ�룬��head��last���޸Ķ������һ����pre��Ҫ�޸ĵ���һ����current�����޸ĵģ�head���޸ĺ��ͷ
 *
 */
public class Main15 {

	public static void main(String[] args) {

	}

}


class Solution15 {
    public ListNode ReverseList(ListNode head) {
    	if(head == null) return null;
    	ListNode pre = head.next,current = head,last = head;
    	   	
    	while(pre != null) {
    		current = pre;
    		pre = current.next;
    		current.next = head;
    		last.next = pre;
    		head = current;
    	}
		return head;
    }
}

