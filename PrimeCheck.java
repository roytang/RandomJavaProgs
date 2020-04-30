import java.io.IOException;

/**
 * Checks if a number is prime.
 */
public class PrimeCheck {

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    int num = Integer.valueOf(sb.toString().trim()).intValue();
    if (isPrime(num)) {
      System.out.println(num + " is prime."); 
    } else {
      System.out.println(num + " is not prime.");
    }
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
