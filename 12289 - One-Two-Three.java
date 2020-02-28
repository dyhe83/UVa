import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] word = new String[] {"one  ", "two  ", "three"};
		int N = scn.nextInt();
		scn.nextLine();
		while (N-- > 0) {
			String inp = scn.nextLine();
			int n = inp.length();
			int[] sum = new int[3];
			Arrays.fill(sum, 0);
			for (int i = 0; i < n; i++)
				for (int j = 0; j < 3; j++)
					if (word[j].charAt(i) == inp.charAt(i))
						sum[j]++;
			int max = -1, ind = -1;
			for (int i = 0; i < 3; i++)
				if (sum[i] > max) {
					max = sum[i];
					ind = i;
				}
			System.out.println(ind + 1);
		}
	}
}
