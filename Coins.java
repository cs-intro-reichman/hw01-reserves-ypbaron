/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int q = m / 25;
		int c = m - (q * 25);
		System.out.println("Use " + q + " quarters and " + c + " cents");
	}
}