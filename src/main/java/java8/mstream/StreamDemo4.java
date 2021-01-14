package java8.mstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
	
	public static void main(String[] args) {
		
		Stream<String> streams=Stream.generate(()->"OWOWOWOWOWOWOW");
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		//streams.forEach(s->System.out.println(s));
	}

}
