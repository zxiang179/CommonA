package sword2offer;

import org.junit.Test;

/**
 * �滻�ո�
 * @author Carl_Hugo
 * 2017��10��12�� ����11:20:00
 */
public class Mian4 {
	/**
	 * ���ַ����еĿո��滻��%20
	 * ˼·���ȼ����ַ����еĿո����������ַ����еĿո������������ַ����ĳ���
	 * ʹ������ָ�룬�Ӻ���ǰ�����ַ�����ֵ���������ո�����ַ���%20�滻
	 * @param inputStr
	 * @param length
	 */
	public void ReplaceBlank(String inputStr,int length){
		
		char[] inputCharArr = inputStr.toCharArray();
		int countBlank = 0;
		for(int i=0;i<inputCharArr.length;i++){
			if(inputCharArr[i]==' ')countBlank++;
		}
		//���ո�ת��Ϊ%20
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
