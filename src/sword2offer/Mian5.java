package sword2offer;

import java.util.Stack;

import org.junit.Test;

/**
 * ��β��ͷ��ӡ����
 * @author Carl_Hugo
 * 2017��10��12�� ����8:38:54
 */
public class Mian5 {
	
	/**
	 * ����һ������ջ,��Ԫ��ȫ����ջ��֮���ջ�����
	 * @param head
	 */
	public void PrintListReversingly_Iteratorly(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		//�ж���������
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
	 * ���������ݹ�
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
