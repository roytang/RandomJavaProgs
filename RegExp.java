/**
 *  Matches a string against a regular expression
 */
public class RegExp {

  public static void main(String[] args) {
    String str = "John Smith";
    String str2 = "John9Smith";
    String regexp = "(\\w+)\\s(\\w+)";
    if (args.length>=1) {
      regexp = args[0]; 
    }
    if (args.length>=2) {
      str = args[1]; 
    }
    if (args.length>=2) {
      str2 = args[2]; 
    }
    match(str, regexp);
    match(str2, regexp);
  }

	/**
	 * @param str
	 * @param regexp
	 */
	private static void match(String str, String regexp) {
    if (str.matches(regexp)) {
    	System.out.println(str + " matches expression " + regexp);
    } else {
      System.out.println(str + " does not match expression " + regexp);
    }
	}
}
