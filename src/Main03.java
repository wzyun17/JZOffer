import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author User
 * 思路：递归，到最尾部时候才开始往回打印
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