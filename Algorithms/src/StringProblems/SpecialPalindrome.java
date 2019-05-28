package StringProblems;

/**
 * @author SefakKahriman
 * A string is said to be a special palindromic string if either of two conditions is met:

 * All of the characters are the same, e.g. aaa.
 * All characters except the middle one are the same, e.g. aadaa.
 * A special palindromic substring is any substring of a string which meets one of those criteria. Given a string, determine how many special palindromic substrings can be formed from it.

 * For example, given the string , we have the following 
 * special palindromic substrings: abaaba returns 11 
 * {a,b,a,a,b,a,aa,aba,aba,bab,abaaba}
 *
 */
public class SpecialPalindrome {

	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}

		if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		s = s.substring(1, s.length() - 1); // remove first and last element

		return isPalindrome(s);
	}

	public static int checkIfSpecialPalindrome(String s) {
		int count = s.length();
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String string = s.substring(i, j + 1);
				if (isPalindrome(string))
					count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(checkIfSpecialPalindrome("a")); // returns 1
		System.out.println(checkIfSpecialPalindrome("aba")); // returns 4 {a,b,a,aba}
		System.out.println(checkIfSpecialPalindrome("abaaba")); //returns 11 {a,b,a,a,b,a,aa,aba,aba,bab,abaaba}
		System.out.println(checkIfSpecialPalindrome("ab")); // returns 2
		System.out.println(checkIfSpecialPalindrome("abcbaba")); // returns 11 {a,b,c,b,a,b,a,bcb,bab,aba,abcba}

	}

}
