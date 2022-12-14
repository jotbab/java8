package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapEx1 {

	public static void main(String[] args) {

		Map<String, Integer>map1 = new HashMap<>();
		Map<String, String>map2 = new Hashtable();
		Map<String, Integer>map3 = new TreeMap();
		Properties map4 = new Properties();
		
		//해당 키와 값만 전송
		map1.put("num", 1);
		map1.put("kor", 100);
		map1.put("eng", 90);
		map1.put("mat", 70);
		System.out.println(map1);
		System.out.println(map1.get("num"));
		if(map1.containsKey("his")){
			System.out.println("해당 키가 존재합니다.");
		}
		if(map1.containsValue(100)){
			System.out.println("해당 값이 존재합니다.");
		}
		
		
		map2.put("name", "kim");
		map2.put("height", "174");
		map2.put("weight", "78.6");
		System.out.println(map2);
		System.out.println(Integer.parseInt(map2.get("height")));
		map2.remove("height");
		System.out.println(map2.get("weight"));

		map3.put("num", 2);
		map3.put("kor", 30);
		map3.put("eng", 40);
		map3.put("mat", 50);
		System.out.println(map3);
		System.out.println(map3.get("kor"));
		
		//Properties는 항목이름과 값으로 지정
		map4.setProperty("name", "park");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "80");
		System.out.println(map4);
		System.out.println("이름: "+map4.getProperty("name"));
	}

}
