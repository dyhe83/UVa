import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] inp = new String[9999];
		int n, max = -1;
		for (n = 0; scn.hasNext(); n++) {
			inp[n] = scn.nextLine();
			max = (inp[n].length() > max) ? inp[n].length() : max;
		}
		for (int i = n - 1; i >= 0; i--) {
			if (inp[i].length() == max)
				break;
			for (int j = inp[i].length(); j < max; j++)
				inp[i] += " ";
		}
		for (int j = 0; j < max; j++) {
			String ans = "";
			for (int i = n - 1; i >= 0; i--)
				if (j < inp[i].length())
					ans += inp[i].charAt(j);
			System.out.println(ans);
		}
		scn.close();
	}
}