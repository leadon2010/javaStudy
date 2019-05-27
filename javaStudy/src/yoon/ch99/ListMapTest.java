package yoon.ch99;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Numb {
	int num;

	public Numb(int i) {
		num = i;
	}

	@Override
	public String toString() {
		return "Num= " + num;
	}

}

public class ListMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "ten");
		map.put(20, "twenty");
		map.put(30, "thirty");
		List<Map<Integer, String>> lmap = new ArrayList<>();
		lmap.add(map);
		for (Map<Integer, String> mp : lmap)
			System.out.println(mp);

	}// end of main
}
