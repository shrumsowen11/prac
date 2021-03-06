package Mapping;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		//16
		Map<Integer, String> mapHttpErrors = new ConcurrentSkipListMap<Integer, String>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		mapHttpErrors.put(200, "CREATED");
		System.out.println(mapHttpErrors); //this is just magic of toString method
		String output=mapHttpErrors.get(500);
		System.out.println(output);
	}
}
