package java_20190730;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main (String [] args) {
		
		
		
		// HashMap key 값은 유일해야 하고, value에는 객체를 저장하는대 중복 허용
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//할당
		map.put("1", 111111);
		map.put("2", 222222);
		map.put("3", 333333);
		map.put("4", 4444444);
		map.put("5", 5555555);
		map.put("1", 1111111);
		
		//출력
		Integer value = map.get("1");
		System.out.println(value);
		
		Set<String> set = map.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String k = i.next();
			Integer v = map.get(k);
			System.out.printf("key : %s, value : %d%n",k,v);
			
		}
	}
}
