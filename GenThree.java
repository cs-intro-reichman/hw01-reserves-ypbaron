/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[1]);
		System.out.println((int)((Math.random()*(max - min + 1)) + min));
		System.out.println((int)((Math.random()*(max - min + 1)) + min));
		System.out.println((int)((Math.random()*(max - min + 1)) + min));
		System.out.println("The minimal generated number was " + min);
	}
}
