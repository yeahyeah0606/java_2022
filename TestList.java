package yeahcode;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		String str1 = new String("test1");
		String str2 = new String("test2");
		String str3 = new String("test3");

		
		List<String> list1 = new ArrayList<String>();
		list1.add(str1);
		list1.add(str2);
		list1.add(str3);
		list1.add(str1);
		list1.add(str2);
		
		list1.remove("test2");
		
//		System.out.println(list1.get(1));
		
		for(String s : list1) {
			System.out.println(s);
		}
		
	}
	
}
