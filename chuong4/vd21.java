package chuong4;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class vd21 {
public static void main(String[] args) {
		
		TreeMap<Integer, Double> treeMap = new TreeMap<>();
		
		treeMap.put(6, 9d);
		treeMap.put(7, 10.1d);
		treeMap.put(8, 7.2d);
		treeMap.put(9, 22.28d);
	
		
		Set<Entry<Integer, Double>> set = treeMap.entrySet();
		System.out.println("Cac entry co trong");
		System.out.println(set);
		
		treeMap.replace(7, 6.5d);
		
		treeMap.replace(6, 9d, 5.0d);
		
		System.out.println("Cac entry co trong");
		System.out.println(set);
	}
}
