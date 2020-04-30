import java.io.IOException;

/**
 * Performs simple arithmetic
 */
public class SimpleMath {

	public static void main(String[] args) throws IOException {
    System.out.print("Enter first number: ");
    int num1 = getIntInput();
    System.out.print("Enter second number: ");
    int num2 = getIntInput();
    System.out.print("Enter operation (+,- or *): ");
    String oper = getStrInput();
    if (oper.equals("+")) {
    	System.out.println("Result="+(num1+num2));
    } else if (oper.equals("-")) {
      System.out.println("Result="+(num1-num2));
    } else if (oper.equals("*")) {
      System.out.println("Result="+(num1*num2));
    } else {
      System.out.println("Invalid operation.");
    }
    
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
  
  public static int getIntInput() throws IOException {
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    return Integer.valueOf(sb.toString().trim()).intValue();
  }
  
}
