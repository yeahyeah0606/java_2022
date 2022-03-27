package yeahcode;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>(); 
		map1.put("test1",1);
		map1.put("test2",2);
		map1.put("test3",3);
		map1.put("test4",4);	
		
		map1.remove("test3");
		
		for(String key : map1.keySet()) {
			System.out.println(map1.get(key));
		}
		
	}
}
