import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * Sorts the words in a sentence
 */
public class SentenceSorter {

	public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog.";
    if (args.length>=1) {
    	str = args[0];
    }
    System.out.println("This program accepts a sentence and sorts the words.");
    System.out.println("The current string is: " + str);
    System.out.println("The sorted string is: " + sort(str));
	}

	/**
	 * @param str
	 */
	private static String sort(String str) {
    StringTokenizer st = new StringTokenizer(str, " ");
    TreeSet tree = new TreeSet();
    while (st.hasMoreTokens()) {
      tree.add(st.nextToken());
    }
    StringBuffer sb = new StringBuffer();
    for(Iterator it = tree.iterator(); it.hasNext(); ) {
      sb.append(it.next().toString() + " "); 
    }
		return sb.toString();
	}
}
