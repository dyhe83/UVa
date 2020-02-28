import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int N = scn.nextInt(), t = N, r = 0;
			while (t != 0) {
				r = r * 10 + t % 10;
				t /= 10;
			}
			if (!chk(N)) {
				System.out.println(N + " is not prime.");
				continue;
			}
			if (N == r || !chk(r)) {
				System.out.println(N + " is prime.");
				continue;
			}
			System.out.println(N + " is emirp.");
		}
		scn.close();
	}

	private static boolean chk(int n) {
		if (n == 2)
			return true;
		int m = (int)Math.sqrt(n) + 1;
		if (n % 2 == 0)
			return false;
		else
			for (int i = 3; i < m; i += 2)
				if (n % i == 0)
					return false;
		return true;
	}
}