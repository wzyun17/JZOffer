/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * @author User
 * 思路：搞三个指针，加head。last，修改队列最后一个，pre，要修改的下一个，current正在修改的，head，修改后的头
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

