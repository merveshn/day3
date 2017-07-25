package tr.org.linux.kamp.touppercase;

public class toUppercase {

	public static void main(String[] args) {
		
		String str="merve";
		System.out.println(toUpper(str));
		System.out.println(reverseString(str));
		System.out.println(isPalindrome("ey edip adanada pide ye"));
		
	}
	

	
	public static String toUpper(String str) {
		char a;
		String result="";
		for(int i=0;i<str.length();i++) {
			result+=Character.toUpperCase(str.charAt(i));
		}
	return result;
	}
	
	
	public static String reverseString(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			
			result+=str.charAt(i);
		}
	
	return result;
	}
	
	
	public static boolean isPalindrome(String str) {
		
		return str.equals(reverseString(str));
	}
	

}
