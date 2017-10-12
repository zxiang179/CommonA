package sword2offer;

import org.junit.Test;

/**
 * �ؽ�����������������������������
 * @author Carl_Hugo
 * 2017��10��12�� ����9:10:44
 */
public class Mian6 {
	
	public TreeNode creatBT(int pre[],int in[],int l1,int r1,int l2,int r2){
		if(l1>r1)return null;
		int num = pre[l1];
		int index=0;
		for(int i=l2;i<=r2;i++){
			if(num==in[i]){
				index = i;
				break;
			}
		}
		TreeNode s = new TreeNode(num);
		s.left=s.right=null;
		s.left = creatBT(pre,in,l1+1,l1+index-l2,l2,index-1);
		s.right = creatBT(pre,in,l1+index-l2+1,r1,index+1,r2);
		return s;
	}
	
	/**
	 * ���Ҹ�
	 * @param s
	 */
	public void postOrder(TreeNode s){
		if(s!=null){
			if(s.left!=null)postOrder(s.left);
			if(s.right!=null)postOrder(s.right);
			System.out.print(s.val+" ");
		}
	}
	
	/**
	 * ��������
	 * �ȣ�10 6 4 8 14 12 16
	 * ��:4 6 8 10 12 14 16
	 * �� :4 8 6 12 16 14 10 
	 */
	@Test
	public void test(){
		int[] in = {4,6,8,10,12,14,16};
		int[] pre = {10,6,4,8,14,12,16};
		TreeNode s = creatBT(pre,in,0,pre.length-1,0,in.length-1);
		postOrder(s);
	}
	
	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val = x;
		}
		
	}

}
