import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			boolean flagQ = true, flagP = true, flagS = true;
			int si, pi, qi, n = scn.nextInt();
			int[] stk = new int[n], pri = new int[n], que = new int[n];
			int[][] d = new int[n][2];
			Arrays.fill(stk, -1);
			Arrays.fill(que, -1);
			Arrays.fill(pri, -1);
			si = 0;
			qi = 0;
			pi = 0;
			for (int i = 0; i < n; i++) {
				d[i][0] = scn.nextInt();
				d[i][1] = scn.nextInt();
			}
			if (n > 1) {
				// queue chk
				int QI = 0;
				for (int i = 0; i < n; i++)
					if (d[i][0] == 1)
						que[qi++] = d[i][1];
					else if (que[QI++] != d[i][1])
						flagQ = false;

				// priority chk
				int PI = 0;
				for (int i = 0; i < n; i++)
					if (d[i][0] == 1)
						pri[pi++] = d[i][1];
					else {
						Arrays.sort(pri);
						pri = ArrRev(pri, n);
						if (pri[PI++] != d[i][1])
							flagP = false;
						pri[--PI] = -1;
					}

				// stack chk
				for (int i = 0; i < n; i++)
					if (d[i][0] == 1)
						stk[si++] = d[i][1];
					else {
						int ind = 0;
						stk = ArrRev(stk, n);
						for (int j = n - 1; stk[j] != -1 && j >= 0; j--)
							ind = j;
						if (stk[ind] != d[i][1])
							flagS = false;
						stk[ind] = -1;
						si--;
						stk = ArrRev(stk, n);
					}
			} else {
				if (d[0][0] == 2) {
					flagQ = false;
					flagP = false;
					flagS = false;
				}
			}
			int ans = 0;
			if (flagQ)
				ans++;
			if (flagP)
				ans++;
			if (flagS)
				ans++;
			if (ans == 0)
				System.out.println("impossible");
			else if (ans == 1) {
				if (flagQ) {
					System.out.println("queue");
				}
				if (flagP) {
					System.out.println("priority queue");
				}
				if (flagS) {
					System.out.println("stack");
				}
			} else
				System.out.println("not sure");
		}
		scn.close();
	}

	private static int[] ArrRev(int[] temp, int n) {
		for (int i = 0; i < (n + 1) / 2; i++) {
			int t = temp[i];
			temp[i] = temp[n - i - 1];
			temp[n - i - 1] = t;
		}
		return temp;
	}
}