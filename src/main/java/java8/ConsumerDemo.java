package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> consumer = t ->System.out.println("Hello How are you = " + t);
		consumer.accept("WOWOWOWOWOWO");
	}

}
