/**
 * ����һ����������������е�����k����㡣
 * @author User
 * ˼·������ָ�룬һ�����ƶ�k�Σ�Ȼ������һ���ƶ�������
 */
public class Main14 {

	public static void main(String[] args) {

	}

}


class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	
    	ListNode pre=head,last=head;
    	for(int i = 0;i<k;i++) {
    		//��һ���ж�Ҳ����
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


