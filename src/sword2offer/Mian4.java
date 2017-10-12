package sword2offer;

import org.junit.Test;

/**
 * 替换空格
 * @author Carl_Hugo
 * 2017年10月12日 上午11:20:00
 */
public class Mian4 {
	/**
	 * 将字符串中的空格替换成%20
	 * 思路：先计算字符串中的空格数，根据字符串中的空格数来计算新字符串的长度
	 * 使用两个指针，从后往前向新字符串赋值，当遇到空格后用字符串%20替换
	 * @param inputStr
	 * @param length
	 */
	public void ReplaceBlank(String inputStr,int length){
		
		char[] inputCharArr = inputStr.toCharArray();
		int countBlank = 0;
		for(int i=0;i<inputCharArr.length;i++){
			if(inputCharArr[i]==' ')countBlank++;
		}
		//将空格转换为%20
		int newStrLen = inputStr.length()+countBlank*2;
		char[] newStrArr = new char[newStrLen];
		int i = inputCharArr.length - 1;
		int j = newStrLen - 1;
		while(i>=0&&j>=0){
			char c = inputCharArr[i];
			if(c==' '){
				newStrArr[j]='0';
				newStrArr[--j]='2';
				newStrArr[--j]='%';
				j--;
				i--;
			}else{
				newStrArr[j--]=inputCharArr[i--];
			}
		}
		//print
		for(char c:newStrArr){
			System.out.print(c);
		}
	}
	
	@Test
	public void test(){
		String inputStr = "I am a programmer in ECNU";
		ReplaceBlank(inputStr, inputStr.length());
	}

}
