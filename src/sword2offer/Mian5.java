package sword2offer;

import java.util.Stack;

import org.junit.Test;

/**
 * 从尾到头打印链表
 * @author Carl_Hugo
 * 2017年10月12日 下午8:38:54
 */
public class Mian5 {
	
	/**
	 * 方法一：利用栈,将元素全部进栈，之后出栈并输出
	 * @param head
	 */
	public void PrintListReversingly_Iteratorly(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		//判断特殊输入
		if(head!=null){
			ListNode node = head;
			while(node!=null){
				stack.push(node);
				node = node.next;
			}
			while(!stack.isEmpty()){
				 ListNode popNode = stack.pop();
				 System.out.print(popNode.val+" ");
			}
		}
		return;
	}
	
	/**
	 * 方法二：递归
	 * @param head
	 */
	public void PrintListReversingly_Iteratorly2(ListNode head){
		if(head==null){
			return;
		}
		PrintListReversingly_Iteratorly(head.next);
		System.out.print(head.val);
	}
	
	@Test
	public void test(){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		PrintListReversingly_Iteratorly2(head);
	}
	
	
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x){
			val = x;
		}
	}

}
