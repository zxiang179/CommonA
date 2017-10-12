package sword2offer;

import org.junit.Test;
/**
 * ��ά�����еĲ���
 * @author Carl_Hugo
 * 2017��10��12�� ����11:19:38
 */
public class Mian3 {
	
	/**
	 * ��һ����ά��������һ������ÿһ�ж����մ����ҵ���˳��ÿһ�ж����մ��ϵ��µ�����˳��
	 * ����һ����ά���飬��һ���������жϸ��������Ƿ��к��и�����
	 * 
	 * ˼·��ÿ�β��������е����Ͻǣ�������ִ���Ҫ���ҵ��������޳������ֵ������У�
	 * �������С�ڲ��ҵ����֣����޳������ֵ�������
	 */
	boolean find(int[][] matrix,int rows,int columns,int num){

		boolean find = false;
		//�ж���������
		if(matrix!=null&&rows>0&columns>0){
			int row = 0;
			int column = columns-1;
			while(row<rows&&column>=0){
				if(matrix[row][column]==num){
					find = true;
					break;
				}else if(matrix[row][column]>num){
					//���ж�����num
					column--;
				}else{
					//���ж�С��num
					row++;
				}
			}
		}
		return find;
	}

	@Test
	public void test(){
		int[][] m = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int num = 7;
		System.out.println(find(m,m.length,m[0].length,num));
	}
	
}
