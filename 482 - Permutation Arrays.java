import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		scn.nextLine();
		while (N-- > 0) {
			String[] inp = scn.nextLine().split(" ");
			String[] val = scn.nextLine().split(" ");

			int n = inp.length;
			int[] seq = new int[n];
			for (int i = 0; i < n; i++) {
				seq[i] = Integer.valueOf(inp[i]);
			}
			for (int i = 0; i < n - 1; i++)
				for (int j = i + 1; j < n; j++)
					if (seq[i] > seq[j]) {
						int t = seq[i];
						seq[i] = seq[j];
						seq[j] = t;
						String st = val[i];
						val[i] = val[j];
						val[j] = st;
					}
			for (int i = 0; i < n; i++)
				System.out.println(val[i]);
			if (N != 0) {
				scn.nextLine();
				System.out.println();
			}
		}
	}
}
