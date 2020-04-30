import java.io.IOException;

/**
 * Greets the user
 */
public class Greeter {

  public static void main(String[] args) throws IOException {
    System.out.print("Enter your name: ");
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
    	sb.append((char)ch);
      ch = System.in.read();
    }
    System.out.println("Hello, " + sb.toString());
  }
}
