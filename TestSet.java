package yeahcode;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		String str1 = new String("test1");
		String str2 = new String("test2");
		String str3 = new String("test3");
		String str4 = new String("test4");
		
		Set<String> set1 = new HashSet<String>();
		set1.add(str1);
		set1.add(str2);
		set1.add(str3);
		set1.add(str4);
		set1.add(str1);
		set1.add(str2);
		
		set1.remove(str2);
		
		for(String s : set1) {
			System.out.println(s);
		}	
	}
}
