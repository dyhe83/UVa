import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			boolean flag = true;
			int n = scn.nextInt();
			int[] d = new int[n], sub = new int[n - 1];
			for (int i = 0; i < n; i++)
				d[i] = scn.nextInt();
			for (int i = 0; i < n - 1; i++)
				sub[i] = Math.abs(d[i + 1] - d[i]);
			Arrays.sort(sub);
			for (int i = 0; i < n - 1; i++) {
				if (sub[i] != i + 1) {
					flag = false;
					break;
				}
			}
			String ans = "Not jolly";
			if (flag)
				ans = "Jolly";
			System.out.println(ans);
		}
		scn.close();
	}
}