
/**
 * Reverses a passed word.
 */
public class WordReverser {

	public static void main(String[] args) {
    String str = "Madam, I'm Adam";
    if (args.length>=1) {
    	str = args[0];
    }
    System.out.println("This program accepts a string and reverses it.");
    System.out.println("The current string is: " + str);
    System.out.println("The scrambled string is: " + reverse(str));
	}

	/**
	 * @param str
	 */
	private static String reverse(String str) {
		int length = str.length();
    StringBuffer sb = new StringBuffer();
    for(int i=length-1;i>=0;i--) {
      sb.append(str.charAt(i));
    }
		return sb.toString();
	}
}
