import java.util.Random;

/**
 * Randomly generates an alphanumeric password
 */
public class PasswordGenerator {
	public static void main(String[] args) {
    int length = 20;
    if (args.length>=1) {
    	length = Integer.valueOf(args[0]).intValue(); 
    }
    System.out.println("Generating a random alphanumeric password with length " + length);
    System.out.println(getPassword(length));
  }
  
  public static String getPassword(int length) {
  	Random rand = new Random();
    int minValue = '0';
    int maxValue = 'z';
    StringBuffer sb = new StringBuffer();
    for(int i=0; i<length; i++) {
      int thisChar = minValue + rand.nextInt(maxValue-minValue);
      if (Character.isLetterOrDigit(thisChar)) { // alphanumeric only
      	sb.append((char)thisChar);
      } else {
        i--; // if not, this one doesn't count
      }
    }
  	return sb.toString(); 
  }
  
}
