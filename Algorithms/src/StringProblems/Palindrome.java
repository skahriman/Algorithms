package StringProblems;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		
		if(s.length() <= 1) {
			return true;
		}
		
		if(s.charAt(0) != s.charAt(s.length()-1))
			return false;
		s = s.substring(1, s.length()-1); // remove first and last element
		
		return isPalindrome(s);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("a"));
		System.out.println(isPalindrome("aa"));
		System.out.println(isPalindrome("aba"));
		System.out.println(isPalindrome("abaXaba"));
		System.out.println(isPalindrome("ab"));
	}

}
