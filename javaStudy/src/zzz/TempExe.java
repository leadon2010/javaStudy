package zzz;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TempExe {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 10);
		map.put("Two", 20);
		
		map = new Hashtable<String, Integer>();
		map.put("One", 10);
		map.put("Two", 20);
	}
}
