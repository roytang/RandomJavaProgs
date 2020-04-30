import java.io.IOException;
import java.util.Random;

/**
 * Magically answers your questions!
 */
public class MagicEightBall {

	public static void main(String[] args) throws IOException {
    System.out.print("Ask the magic 8-ball a yes-or-no question: ");
    String question = getStrInput();
    System.out.println(getMessage());
	}
  
  public static String getMessage() {
    String[] messages = new String[] {
      "Yes", "No", "All signs point to yes.",
      "The future looks hazy.", "You bet!", "I doubt it.",
      "Highly unlikely.", "Ask again in ten minutes.",
      "I don't have the answer.", "Look to your heart.",
      "It is true.", "It is false."
    };
    Random rand = new Random();
    return messages[rand.nextInt(messages.length)]; 
  }
  
  public static String getStrInput() throws IOException {
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    return sb.toString().trim();
  }  
}
