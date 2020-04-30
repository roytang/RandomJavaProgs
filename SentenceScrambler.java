import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Scrambles a passed sentence
 */
public class SentenceScrambler {

	public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog.";
    if (args.length>=1) {
    	str = args[0];
    }
    System.out.println("This program accepts a sentence and scrambles it.");
    System.out.println("The current string is: " + str);
    System.out.println("The scrambled string is: " + scramble(str));
	}

	/**
	 * @param str
	 */
	private static String scramble(String str) {
    Vector  v = new Vector();
    StringTokenizer st = new StringTokenizer(str, " ");
    while (st.hasMoreTokens()) {
      v.add(st.nextToken());
    }
    Random rand = new Random();
    StringBuffer sb = new StringBuffer();
    int size = v.size();
    while (size >0) {
      int index = rand.nextInt(size);
      sb.append(v.elementAt(index) + " "); // output the char at that pos
      v.remove(index); // then remove it
    	size = v.size();
    }
		return sb.toString();
	}
}
