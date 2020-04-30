/**
 * Prints out a multiplication table. Optionally pass the dimensions of the table. Default 10.
 */
public class MultiplicationTable {

	public static void main(String[] args) {
    int dimension = 10;
		if (args.length>=1) {
      dimension = Integer.valueOf(args[0]).intValue();
		}
    printTable(dimension);
	}

	/**
	 * @param dimension
	 */
	private static void printTable(int dimension) {
    // show header
    System.out.print("x\t"); // show line numner
    for(int j=0; j<dimension; j++) {
      System.out.print(j+"\t");
    }
    System.out.print("\n"); // end of line
    
    for(int i=1; i<=dimension; i++) {
      System.out.print(i+"\t"); // show line numner
      for(int j=1; j<=dimension; j++) {
      	System.out.print((i*j)+"\t");
      }
      System.out.print("\n"); // end of line
    }
	}
}
