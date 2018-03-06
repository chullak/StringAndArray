package org.coding.practice.string.duplicatechar;

public class BitWiseOperator {
	public static void main(String[] args) {

		System.out.println(hasDuplicate("abcdefghij"));
		System.out.println(hasDuplicate("abcb"));

	}

	private static boolean hasDuplicate(String string) {
		int t = 0;
		for (Character c : string.toCharArray()) {

			//System.out.println("***************************************");

			//System.out.println(Integer.toBinaryString(t));

			//System.out.println(Integer.toBinaryString(1 << getInt(c)));

			if ((t & 1 << getInt(c)) != 0) {
				return false;
			}
			t = t | 1 << getInt(c);
		}
		return true;
	}

	private static int getInt(Character c) {
		return Character.getNumericValue(c) - Character.getNumericValue('a');
	}
}
