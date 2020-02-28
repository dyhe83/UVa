import java.util.*;
import java.math.*;
class Main {
	public static void main(String[] args) {
		BigInteger f[] = new BigInteger[5001];
		f[0] = new BigInteger(0 + "");
		f[1] = new BigInteger(1 + "");
		f[2] = new BigInteger(1 + "");
		for (int i = 3; i < 5001; i++)
			f[i] = f[i - 1].add(f[i - 2]);
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int n = scn.nextInt();
			System.out.println("The Fibonacci number for " + n + " is " + f[n]);
		}
	}
}