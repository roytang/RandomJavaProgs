import java.io.IOException;

/**
 * Returns the prime factors.
 */
public class PrimeFactorization {

  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");
    StringBuffer sb = new StringBuffer();
    int ch = System.in.read();
    while (ch!='\n' && ch > 0) {
      sb.append((char)ch);
      ch = System.in.read();
    }
    int num = Integer.valueOf(sb.toString().trim()).intValue();
    System.out.println("Prime factorization is " + getFactors(num));
  }
  
	private static String getFactors(int aNumber) {
    StringBuffer sb = new StringBuffer();
    int num = aNumber;
    for (int i=2; i<=num; i++) {
      if (isPrime(i)) {
        while(num%i==0) {
          sb.append(i+"x");
          num=num/i;
        }
      }
    }
		return sb.toString().substring(0, sb.length()-1);
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
