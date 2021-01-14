package java8.mstream;

import java.util.Optional;
import java.util.stream.Stream;

//What is difference between Comparable and Comparator
public class MinExample {
	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","gorilla","bonob");
		//Comparator<String>  comp=(s1,s2)-> return int
		//min, max , sort
		Optional<String> optional=s.min((s1,s2)->s1.length()-s2.length());//Comparator
		if(optional.isPresent()) {
			String sss=optional.get();
		}else {
			
		}
		/*optional.ifPresent(t->System.out.println(t));*/
		optional.ifPresent(System.out::println);
	}
}
