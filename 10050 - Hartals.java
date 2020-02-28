import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		while (N-- > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] day = new int[n + 1], dif = new int[m];
			for (int i = 0; i < m; i++)
				dif[i] = scn.nextInt();
			Arrays.fill(day, 0);
			int step;
			for (int i = 0; i < m; i++) {
				step = dif[i];
				while (step <= n) {
					day[step] = 1;
					step += dif[i];
				}
			}
			int ans = 0;
			for (int i = 1; i < n + 1; i++)
				if ((i % 7 != 0) && (i % 7 != 6))
					if (day[i] == 1)
						ans++;
			System.out.println(ans);
		}
		scn.close();
	}
}