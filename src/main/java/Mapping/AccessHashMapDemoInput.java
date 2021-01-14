package Mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class AccessHashMapDemoInput {

	public static void main(String[] args) {
		//16
		Map<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter key");
		int key=scan.nextInt();
		System.out.println("Enter value");
		String value=scan.next();
		mapHttpErrors.put(key, value);
		
		System.out.println("Enter key");
		 key=scan.nextInt();
		System.out.println("Enter value");
		 value=scan.next();
		mapHttpErrors.put(key, value);
		
		System.out.println(mapHttpErrors); //this is just magic of toString method
		String output=mapHttpErrors.get(500);
		System.out.println(output);
		//Accessing Map
		Set<Integer> keys=mapHttpErrors.keySet();
		for(Integer t:keys) {
			String v=mapHttpErrors.get(t);
			System.out.println("key  = "+t);
			System.out.println("value  = "+v);
		}
		
	}
}
