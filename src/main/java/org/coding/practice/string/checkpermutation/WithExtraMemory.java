package org.coding.practice.string.checkpermutation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WithExtraMemory {

	public static void main(String[] args) {
		System.out.println(hasSamePermutation("abc", "baac"));
		System.out.println(hasSamePermutation("abc", "bac"));
		
	}

	private static boolean hasSamePermutation(String string, String string2) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer temp;
		for (Character c : string.toCharArray()) {
			temp = map.get(c);
			if (temp == null)
				temp = 0;
			temp++;
			map.put(c, temp);
		}
		for (Character c : string2.toCharArray()) {
			temp = map.get(c);
			if (temp == null)
				temp = 0;
			temp--;
			map.put(c, temp);
		}

		for (Integer i : map.values()) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

}
