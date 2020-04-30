import java.util.Calendar;

/**
 * Outputs no. of days before Christmas
 */
public class DaysBeforeChristmas {
  public static void main(String[] args)  {
    Calendar calNow = Calendar.getInstance();
    Calendar calXmas = Calendar.getInstance();
    calXmas.set(Calendar.YEAR, calNow.get(Calendar.YEAR));
    calXmas.set(Calendar.MONTH, Calendar.DECEMBER);
    calXmas.set(Calendar.DAY_OF_MONTH, 25);
    // skip to next year if needed
    while (calNow.after(calXmas)) {
    	calXmas.add(Calendar.YEAR,1);
    }
    long diffInMillis = calXmas.getTimeInMillis() - calNow.getTimeInMillis();
    double millisPerDay = 24*60*60*1000;
    double daysBeforeXmas = ((double)diffInMillis)/millisPerDay;
    System.out.println("There are " + daysBeforeXmas + " days before Christmas.");
  }
}
