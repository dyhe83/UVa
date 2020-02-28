import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = 0;
		while (true) {
			int row = scn.nextInt();
			int col = scn.nextInt();
			if (row == 0 && col == 0)
				break;
			if (N != 0)
				System.out.println();
			System.out.println("Field #" + (++N) + ":");
			char[][] map = new char[row][col];
			int[][] cou = new int[row + 2][col + 2];
			for (int i = 0; i < row; i++)
				Arrays.fill(cou[i], 0);
			scn.nextLine();
			for (int i = 0; i < row; i++) {
				String inp = scn.nextLine();
				for (int j = 0; j < col; j++)
					map[i][j] = inp.charAt(j);
			}
			for (int i = 0; i < row; i++)
				for (int j = 0; j < col; j++)
					if (map[i][j] == '*')
						for (int x = -1; x < 2; x++)
							for (int y = -1; y < 2; y++)
								cou[i + x + 1][j + y + 1]++;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++)
					if (map[i][j] == '*')
						System.out.print('*');
					else
						System.out.print(cou[i + 1][j + 1]);
				System.out.println();
			}
		}
		scn.close();
	}
}