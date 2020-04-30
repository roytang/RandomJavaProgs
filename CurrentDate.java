import java.util.Date;

/**
 * Outputs the current date
 */
public class CurrentDate {
  public static void main(String[] args)  {
    Date dt = new Date(System.currentTimeMillis());
    System.out.println("The current date is " + dt);
  }
}
