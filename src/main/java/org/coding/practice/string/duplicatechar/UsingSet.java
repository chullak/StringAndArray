package org.coding.practice.string.duplicatechar;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {
	public static void main(String[] args) {

		System.out.println(hasDuplicate("abcdefghij"));
		System.out.println(hasDuplicate("abcdefghcij"));

	}

	private static boolean hasDuplicate(String string) {
		Set<Character> set = new HashSet<Character>();
		for (Character c : string.toCharArray()) {
			if (set.contains(c)) {
				return false;

			}
			set.add(c);
		}
		return true;
	}
}
