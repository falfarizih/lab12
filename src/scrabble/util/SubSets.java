package scrabble.util;

import java.util.HashSet;
import java.util.Set;

public class SubSets {
	public static Set<String> getSubSets(String str) {
		Set<String> subsets = new HashSet<>();
		generateSubSets("", str, subsets);
		return subsets;
	}

	private static void generateSubSets(String prefix, String str, Set<String> subsets) {
		int n = str.length();
		if (n == 0) {
			subsets.add(prefix);
		} else {
			generateSubSets(prefix + str.charAt(0), str.substring(1), subsets);
			generateSubSets(prefix, str.substring(1), subsets);
		}
	}
}
