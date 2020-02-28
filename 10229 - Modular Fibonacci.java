import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] f = new int[3];
		while (scn.hasNext()) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			f[0] = 0;
			f[1] = 1;
			if (m != 0) {
				n %= (int)Math.pow(2, m - 1) * 3;
				m = (int)Math.pow(2, m);
				for (int i = 0; i < n; i++) {
					f[2] = (f[0] + f[1]) % m;
					f[1] = f[0] % m;
					f[0] = f[2] % m;
				}
			}
			System.out.println(f[0]);
		}
		scn.close();
	}
}