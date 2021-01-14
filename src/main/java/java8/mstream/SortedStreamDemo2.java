package java8.mstream;

import java.util.Arrays;
import java.util.List;

public class SortedStreamDemo2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() > 3).sorted()
		 .limit(6).forEach(System.out::println);
	}
}
