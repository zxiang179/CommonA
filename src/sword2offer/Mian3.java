package sword2offer;

import org.junit.Test;
/**
 * 二维数组中的查找
 * @author Carl_Hugo
 * 2017年10月12日 上午11:19:38
 */
public class Mian3 {
	
	/**
	 * 在一个二维数组中找一个数，每一行都按照从左到右递增顺序，每一列都按照从上到下递增的顺序。
	 * 输入一个二维数组，和一个整数，判断该数组中是否有含有该整数
	 * 
	 * 思路：每次查找数组中的右上角，如果数字大于要查找的数字则剔除该数字的所在列，
	 * 如果数字小于查找的数字，则剔除该数字的所在行
	 */
	boolean find(int[][] matrix,int rows,int columns,int num){

		boolean find = false;
		//判断特殊输入
		if(matrix!=null&&rows>0&columns>0){
			int row = 0;
			int column = columns-1;
			while(row<rows&&column>=0){
				if(matrix[row][column]==num){
					find = true;
					break;
				}else if(matrix[row][column]>num){
					//该列都大于num
					column--;
				}else{
					//该行都小于num
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
