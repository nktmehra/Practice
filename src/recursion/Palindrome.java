package recursion;

public class Palindrome {

	public static void main(String[] args) {
		String str = "aabaa";
		if(isPalindrome(str)) {
			System.out.println("Yes"); 
		}else {
			System.out.println("No");
		}
	}
	
	static  boolean palindromeRec(String str, int s , int e) {
		if(s==e) {
			return true;
		}
		
		
		if(str.charAt(s)!=str.charAt(e)) {
			return false;
		}
		
		if(s<=e) {
			return palindromeRec(str, s+1, e-1);
		}
		return true;
		
		
	}
	
	static boolean isPalindrome(String str) {
		int n = str.length();
		if(n==0) {
			return false;
		}
		return palindromeRec(str, 0, n-1);
	}
	

	

}
