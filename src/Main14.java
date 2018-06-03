/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author User
 * 思路：两个指针，一个先移动k次，然后两个一起移动。。。
 */
public class Main14 {

	public static void main(String[] args) {

	}

}


class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	
    	ListNode pre=head,last=head;
    	for(int i = 0;i<k;i++) {
    		//用一个判断也可以
    		try {
				pre = pre.next;
			} catch (Exception e) {
				return null;
			}
    	}
    	while(pre!=null) {
    		pre=pre.next;
    		last=last.next;
    	}
		return last;

    }
}


