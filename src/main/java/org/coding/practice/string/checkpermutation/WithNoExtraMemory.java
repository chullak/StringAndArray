package org.coding.practice.string.checkpermutation;

import java.util.Arrays;

public class WithNoExtraMemory {

	public static void main(String[] args) {
		System.out.println(hasSamePermutation("abc", "baac"));
		System.out.println(hasSamePermutation("abc", "bac"));
		System.out.println(hasSamePermutation("abc", "baac"));
		
	}

	private static boolean hasSamePermutation(String string, String string2) {

		char c[] = string.toCharArray();
		Arrays.sort(c);

		char c2[] = string2.toCharArray();
		Arrays.sort(c2);

		for (int i = 0; i < c.length; i++) {

			if (c[i] != c2[i])
				return false;
		}

		return true;
	}

}
