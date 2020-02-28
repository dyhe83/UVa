import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int str = scn.nextInt();
			long tar = scn.nextLong();
			System.out.println((long)Math.ceil(
			    (Math.sqrt(1 - 4 * (-str * str + str - 2 * tar)) - 1) / 2));
		}
		scn.close();
	}
}