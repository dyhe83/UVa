import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int n = scn.nextInt();
			int[] d = new int[n];
			for (int i = 0; i < n; i++)
				d[i] = scn.nextInt();
			Arrays.sort(d);
			int str, end, ans;
			if (n % 2 == 0) {
				str = d[n / 2 - 1];
				end = d[n / 2];
			} else {
				str = d[n / 2];
				end = str;
			}
			ans = str;
			boolean flag = false;
			int cou = 0;
			for (int i = 0; i < n; i++)
				if (d[i] == str || d[i] == end) {
					cou++;
					flag = true;
				} else if (flag)
					break;
			System.out.println(ans + " " + cou + " " + (end - str + 1));
		}
		scn.close();
	}
}