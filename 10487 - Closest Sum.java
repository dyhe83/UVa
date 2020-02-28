import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = 0;
		while (true) {
			Set<Integer> set = new HashSet<Integer>();
			int n = scn.nextInt();
			if (n == 0)
				break;
			int d[] = new int[n];
			for (int i = 0; i < n; i++)
				d[i] = scn.nextInt();
			for (int i = 0; i < n; i++)
				for (int j = i + 1; j < n; j++)
					set.add(d[i] + d[j]);
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			int x[] = new int[list.size()];
			for (int i = 0; i < list.size(); i++)
				x[i] = list.get(i);
			int m = scn.nextInt();
			int tar[] = new int[m];
			for (int i = 0; i < m; i++)
				tar[i] = scn.nextInt();
			System.out.printf("Case %d:\r\n", (++N));
			for (int i = 0; i < m; i++)
				System.out.printf("Closest sum to %d is %d.\r\n", tar[i],
				                  sea(x, tar[i]));
		}
		scn.close();
	}
	static int sea(int x[], int tar) {
		int n = x.length, ans = 0, min = 10011;
		for (int i = 0; i < n; i++)
			if (Math.abs(x[i] - tar) <= min) {
				min = Math.abs(x[i] - tar);
				ans = x[i];
			}
		return ans;
	}
}