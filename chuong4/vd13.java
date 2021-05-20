package chuong4;
import java.util.LinkedHashSet;
import java.util.Set;

public class vd13 {
	public static void main(String[] args) {
		Set<String> e = new LinkedHashSet<>();
		e.add("JAVA");
		e.add("C#");
		e.add("PYTHON");
		e.add("C++");
		for (String str : e) {
			System.out.println(str);
		}
	}
}
