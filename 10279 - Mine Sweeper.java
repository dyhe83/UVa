import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		while (N-- > 0) {
			int n = scn.nextInt() + 2;
			scn.nextLine();
			char[][] d = new char[n][n];
			char[][] hit = new char[n][n];
			int[][] cou = new int[n][n];
			for (int i = 0; i < n; i++) {
				Arrays.fill(d[i], ' ');
				Arrays.fill(hit[i], ' ');
				Arrays.fill(cou[i], 0);
			}
			for (int i = 1; i < n - 1; i++) {
				String inp = scn.nextLine();
				for (int j = 1; j < n - 1; j++)
					d[i][j] = inp.charAt(j - 1);
			}
			boolean over = false;
			for (int i = 1; i < n - 1; i++) {
				String inp = scn.nextLine();
				for (int j = 1; j < n - 1; j++) {
					hit[i][j] = inp.charAt(j - 1);
					if (d[i][j] == '*' && hit[i][j] == 'x')
						over = true;
				}
			}

			for (int i = 1; i < n; i++)
				for (int j = 1; j < n; j++)
					if (d[i][j] == '*')
						for (int k = -1; k < 2; k++)
							for (int l = -1; l < 2; l++)
								cou[i + k][j + l]++;
			if (over)
				for (int i = 1; i < n - 1; i++) {
					for (int j = 1; j < n - 1; j++)
						if (d[i][j] == '*')
							System.out.print("*");
						else if (hit[i][j] == 'x')
							System.out.print(cou[i][j]);
						else
							System.out.print(".");
					System.out.println();
				}
			else
				for (int i = 1; i < n - 1; i++) {
					for (int j = 1; j < n - 1; j++)
						if (hit[i][j] == 'x')
							System.out.print(cou[i][j]);
						else
							System.out.print(".");
					System.out.println();
				}
			if (N != 0)
				System.out.println();
		}
		scn.close();
	}
}