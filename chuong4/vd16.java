package chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class vd16 {
	public static void main(String[] args) {
		HashMap<String, String> gHashMap = new HashMap<>();
		

		gHashMap.put("C++ ", " Co ban");
		gHashMap.put("JAVA ", " Co ban");
		gHashMap.put("C# ", " Co ban");
		gHashMap.put("PYTHON ", " Co ban");
		
		Set<Map.Entry<String, String>> setHaMaps = gHashMap.entrySet();
		System.out.println("cac entry co trong hashmap");
		System.out.println(setHaMaps);
	}
}
