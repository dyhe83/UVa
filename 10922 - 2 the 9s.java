import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		BigInteger BigZero = new BigInteger("0");
		BigInteger BigNine = new BigInteger("9");
		Scanner scn = new Scanner(System.in);
		int N = 0;
		while (true) {
			BigInteger t = scn.nextBigInteger();
			String inp = t.toString();
			if (inp.equals("0"))
				break;
			System.out.print(inp);
			if (!chk9(inp)) {
				System.out.println(" is not a multiple of 9.");
				continue;
			}
			int ans = 0;
			do {
				inp = sum9(inp) + "";
				ans++;
			} while (chk9(inp) && !inp.equals("9"));
			System.out.println(" is a multiple of 9 and has 9-degree " + ans +
			                   ".");
		}
		scn.close();
	}

	private static boolean chk9(String str) {
		int sum = sum9(str);
		if (sum % 9 == 0)
			return true;
		return false;
	}

	private static int sum9(String str) {
		int n = str.length(), sum = 0;
		for (int i = 0; i < n; i++)
			sum += (int)str.charAt(i) - 48;
		return sum;
	}
}