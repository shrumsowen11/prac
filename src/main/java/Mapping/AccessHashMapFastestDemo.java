package Mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccessHashMapFastestDemo {

	public static void main(String[] args) {
		
		//16
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		mapHttpErrors.put(200, "CREATED");
		mapHttpErrors.put(300, "CREATED");
		System.out.println(mapHttpErrors); //this is just magic of toString method
		String output=mapHttpErrors.get(500);
		System.out.println(output);
		Set<Map.Entry<Integer, String>>  entries=mapHttpErrors.entrySet();
		for(Map.Entry<Integer, String> entry:entries) {
			System.out.println("@))@@)");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
