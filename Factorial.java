import java.io.IOException;

/**
 * Computes the factorial of a number
 */
public class Factorial {

	public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    int num = getIntInput();
    System.out.println("The factorial of " + num + " is " + factorial(num));
	}
  
  public static int getIntInput() throws IOException {
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    return Integer.valueOf(sb.toString().trim()).intValue();
  }
  
  public static int factorial(int n) {
    if (n>=2) {
      return n*factorial(n-1); 
    } else {
      return 1; 
    }
  }
  
}
