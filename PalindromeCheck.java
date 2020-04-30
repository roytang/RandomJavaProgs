/**
 * Checks if a string is a palindrome. Can accept a passed string
 */
public class PalindromeCheck {

	public static void main(String[] args) {
    if (args.length > 0) {
    	checkPalindrome(args[0]);
    } else {
  		checkPalindrome("Madam I'm Adam");
      checkPalindrome("Madam I'm not Adam");
    }
  }
  
  public static void checkPalindrome(String str) {
  	if (isPalindrome(str)) {
  		System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");      
    }
  }
  
  public static boolean isPalindrome(String str) {
    String strCleaned = stripNonLetter(str);
    int length = strCleaned.length();
    for(int i=0; i<length/2; i++) {
    	if (strCleaned.toUpperCase().charAt(i)!=strCleaned.toUpperCase().charAt(length-i-1)) {
    		return false;
      }
    }
    return true;
  }
  
  public static String stripNonLetter(String str) {
    StringBuffer sb = new StringBuffer();
    int length = str.length();
  	for (int i=0; i<length; i++) {
      if (Character.isLetter(str.charAt(i))) {
      	sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }
}
