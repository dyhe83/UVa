import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		while (N-- > 0) {
			int n = scn.nextInt();
			int[] d = new int[n];
			for (int i = 0; i < n; i++)
				d[i] = scn.nextInt();
			Arrays.sort(d);
			int sum = 0, mid = 0;
			if (n % 2 == 1)
				mid = d[n / 2];
			else
				mid = (d[n / 2] + d[n / 2 - 1]) / 2;
			for (int i = 0; i < n; i++)
				sum += Math.abs(mid - d[i]);
			System.out.println(sum);
		}
		scn.close();
	}
}