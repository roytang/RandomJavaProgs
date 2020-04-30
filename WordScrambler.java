import java.util.Random;
import java.util.Vector;

/**
 * Scrambles a passed word.
 */
public class WordScrambler {

	public static void main(String[] args) {
    String str = "All the empty things described as me";
    if (args.length>=1) {
    	str = args[0];
    }
    System.out.println("This program accepts a string and scrambles it.");
    System.out.println("The current string is: " + str);
    System.out.println("The scrambled string is: " + scramble(str));
	}

	/**
	 * @param str
	 */
	private static String scramble(String str) {
		int length = str.length();
    Vector  v = new Vector();
    for(int i=length-1;i>=0;i--) {
      v.add(new String(""+str.charAt(i)));
    }
    Random rand = new Random();
    StringBuffer sb = new StringBuffer();
    while (length >0) {
      int index = rand.nextInt(length);
      sb.append(v.elementAt(index)); // output the char at that pos
      v.remove(index); // then remove it
    	length = v.size();
    }
		return sb.toString();
	}
}
