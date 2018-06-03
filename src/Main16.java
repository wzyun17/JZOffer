/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author User
 * 思路：再重新弄一个链表存储。。 我的方法，再重新new 一个太麻烦了，其实直接操作无所谓的，不用非得new。。。
 *       递归版本比较简单。。。
 */
public class Main16 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);
		new Solution16().Merge(l1, l2);
	}

}

class Solution16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1 == null) return list2;
    	if(list2 == null) return list1;
    	ListNode resultHead = null;
    	if(list1.val>list2.val) {
    		resultHead = new ListNode(list2.val);
    		list2 = list2.next;
    	}else {
    		resultHead = new ListNode(list1.val);
    		list1 = list1.next;
    	}
    	ListNode resultTail = resultHead;
    	//&&和||一定要整明白啊错好多次了
    	
    	while((list1!=null)&&(list2!=null)) {
    		if(list1.val>list2.val) {
    			ListNode result =new ListNode(list2.val);
    			list2 = list2.next;
    			resultTail.next = result;
    			resultTail = result;
    		}else {
    			ListNode result =new ListNode(list1.val);
    			list1 = list1.next;
    			resultTail.next = result;
    			resultTail = result;
			}
    	}
    	if(list1 == null) {
    		while(list2!=null) {
    			ListNode result =new ListNode(list2.val);
    			list2 = list2.next;
    			resultTail.next = result;
    			resultTail = result;
    		}
    	}
    	if(list2 == null) {
    		while(list1!=null) {
    			ListNode result =new ListNode(list1.val);
    			list1 = list1.next;
    			resultTail.next = result;
    			resultTail = result;
    		}
    	}
		return resultHead;
        
    }
}

/*链接：https://www.nowcoder.com/questionTerminal/d8b6b4358f774294a89de2a6ac4d9337
来源：牛客网

public ListNode Merge(ListNode list1,ListNode list2) {
       if(list1 == null){
           return list2;
       }
       if(list2 == null){
           return list1;
       }
       if(list1.val <= list2.val){
           list1.next = Merge(list1.next, list2);
           return list1;
       }else{
           list2.next = Merge(list1, list2.next);
           return list2;
       }       
   }*/
