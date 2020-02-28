import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		for (int i = 0; i < n; i++) {
			String s1 = scn.nextLine();
			String s2 = scn.nextLine();
			if (gcd(Integer.parseInt(s1, 2), Integer.parseInt(s2, 2)))
				System.out.printf("Pair #%d: All you need is love!\n", i + 1);
			else
				System.out.printf("Pair #%d: Love is not all you need!\n",
				                  i + 1);
		}
		scn.close();
	}
	static boolean gcd(int a, int b) {
		boolean ans;
		while (a != 0) {
			if (a < b) {
				int t = a;
				a = b;
				b = t;
			}
			a -= b;
		}
		if (b != 1)
			ans = true;
		else
			ans = false;
		return ans;
	}
}