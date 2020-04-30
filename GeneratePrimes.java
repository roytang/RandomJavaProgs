import java.io.IOException;

/**
 * Generates all prime numbers below a certain number.
 */
public class GeneratePrimes {

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    int num = Integer.valueOf(sb.toString().trim()).intValue();
    System.out.println("Prime numbers between 1 and " + num + ": ");
    System.out.println(listPrimes(num));
  }
  
	private static String listPrimes(int num) {
    StringBuffer sb = new StringBuffer();
    for(int i=0; i<=num;i++) {
      if (isPrime(i)) {
        sb.append(i + ", "); 
      }
    }
		return sb.toString().substring(0, sb.length()-2);
	}

	public static boolean isPrime(int aNumber) {
    if (aNumber<=1) return false;
    int startingPoint = (int)Math.sqrt((double)aNumber);
    for (int i=startingPoint; i>1; i--) {
      if (aNumber%i==0) {
        return false;
      }
    }
    return true;
  }
}
