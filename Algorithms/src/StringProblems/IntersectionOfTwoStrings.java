package StringProblems;

public class IntersectionOfTwoStrings {

	// get intersection of 2 strings
	static String getIntersection(String s1, String s2) {
		String common = "";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.length() == 0 || s1.length() == 0)
					return common;
				if (s1.charAt(i) == s2.charAt(j)) {
					common = common + s1.charAt(i);
					// delete character from each if there is a match
					s1 = s1.substring(0, i) + s1.substring(i + 1);
					s2 = s2.substring(0, j) + s2.substring(j + 1);
					i = -1;
					break;
				}
			}
		}
		return common;
	}

	public static void main(String[] args) {
		System.out.println(getIntersection("abcaa", "baacd"));
		System.out.println(getIntersection("a", "aa"));
	}
}
