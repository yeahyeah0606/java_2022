package yeahcode;

import java.util.Arrays;

/*
 * �r����double   ...��r�� 
 */

public class ycode {
	public static void main(String args[]) {
		double d =Double.parseDouble("3.14");
		System.out.println(d);
		
		double d1 =3.14;
		String s = String.valueOf(d1);
		System.out.println(d1);
		
		/*
		 *  copy�}�C���i������=   �]��stack heap....
		 */
		int [] num1 = {1,2};
		int [] num2 = Arrays.copyOf(num1, 2);
		num2[1] = 3;
		System.out.println(num1[1]);
		
		/*
		 * �r��N�O�r���}�C
		 */
		String str = "abc";
		System.out.println(str.charAt(1));
		
		/*
		 * �r�����
		 */
		String st1 = "test1, test2, test3";
		String [] sArray = st1.split(",");
		System.out.println(sArray[2]);
		System.out.println(sArray[2].trim());  //�����ť�
		
		
		
		String str2 = "abcdef";
		System.out.println(str2.substring(1,4));   //�e�] �ᤣ�]
		
		String str3 = "aabbccdd";
		System.out.println(str3.indexOf("b"));    //�����
		System.out.println(str3.lastIndexOf("c"));
		
		System.out.println(str3.substring(str3.indexOf("b"),str3.lastIndexOf("c")+1));
		
		System.out.println(str3.contains("bc"));   //�O�_���]�t
		
		String str4 = "abcABC123";
		System.out.println(str4.replace("a", "f"));   //����
		
		/*
		 * ���W��ܪk  Pattern
		 */
		System.out.println(str4.replaceAll("\\d", "!"));  // \d�������Ʀr  
		System.out.println(str4.replaceAll("[a-zA-Z]", "*"));  
		
		
		String str5 = "abc";
		//startwith  �}�l�r�ꬰ?
		System.out.println(str5.startsWith("b"));
		//endwith    �����r�ꬰ?
		System.out.println(str5.endsWith("c"));
		
		/*
		 * equals����r���
		 */
		String str6 = "abc";
		String str7 = "def";
		System.out.println(str6.equals(str7));
		System.out.println(str6.replace("a", "").replace("c", ""));
		
		
		
		
	}
}
