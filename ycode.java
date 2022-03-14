package yeahcode;

import java.util.Arrays;

/*
 * 字串轉double   ...轉字串 
 */

public class ycode {
	public static void main(String args[]) {
		double d =Double.parseDouble("3.14");
		System.out.println(d);
		
		double d1 =3.14;
		String s = String.valueOf(d1);
		System.out.println(d1);
		
		/*
		 *  copy陣列不可直接用=   因為stack heap....
		 */
		int [] num1 = {1,2};
		int [] num2 = Arrays.copyOf(num1, 2);
		num2[1] = 3;
		System.out.println(num1[1]);
		
		/*
		 * 字串就是字元陣列
		 */
		String str = "abc";
		System.out.println(str.charAt(1));
		
		/*
		 * 字串分割
		 */
		String st1 = "test1, test2, test3";
		String [] sArray = st1.split(",");
		System.out.println(sArray[2]);
		System.out.println(sArray[2].trim());  //消除空白
		
		
		
		String str2 = "abcdef";
		System.out.println(str2.substring(1,4));   //前包 後不包
		
		String str3 = "aabbccdd";
		System.out.println(str3.indexOf("b"));    //找索引
		System.out.println(str3.lastIndexOf("c"));
		
		System.out.println(str3.substring(str3.indexOf("b"),str3.lastIndexOf("c")+1));
		
		System.out.println(str3.contains("bc"));   //是否有包含
		
		String str4 = "abcABC123";
		System.out.println(str4.replace("a", "f"));   //替換
		
		/*
		 * 正規表示法  Pattern
		 */
		System.out.println(str4.replaceAll("\\d", "!"));  // \d為全部數字  
		System.out.println(str4.replaceAll("[a-zA-Z]", "*"));  
		
		
		String str5 = "abc";
		//startwith  開始字串為?
		System.out.println(str5.startsWith("b"));
		//endwith    結束字串為?
		System.out.println(str5.endsWith("c"));
		
		/*
		 * equals比較字串值
		 */
		String str6 = "abc";
		String str7 = "def";
		System.out.println(str6.equals(str7));
		System.out.println(str6.replace("a", "").replace("c", ""));
		
		
		
		
	}
}
