package chuong4;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class vd20 {
	public static void main(String[] args) {
		
		TreeMap<Integer, Character> treeMap = new TreeMap<>();
		
		treeMap.put(6, 'A');
		treeMap.put(7, 'B');
		treeMap.put(8, 'C');
		treeMap.put(9, 'D');
		treeMap.put(10, 'E');
		treeMap.put(11, 'F');
		
		Set<Entry<Integer, Character>> set = treeMap.entrySet();
		System.out.println("Cac entry co trong");
		System.out.println(set);
	
	}
}
