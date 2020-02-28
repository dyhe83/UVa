import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (scn.hasNext()) {
			String ans = "", inp = scn.nextLine();
			int old = 0, word = 0, n = inp.length();
			for (int i = 0; i < n; i++) {
				char c = inp.charAt(i);
				word = 0;
				if (c == 'B' || c == 'F' || c == 'P' || c == 'V')
					word = 1;
				else if (c == 'C' || c == 'G' || c == 'J' || c == 'K' ||
				         c == 'Q' || c == 'S' || c == 'X' || c == 'Z')
					word = 2;
				else if (c == 'D' || c == 'T')
					word = 3;
				else if (c == 'L')
					word = 4;
				else if (c == 'M' || c == 'N')
					word = 5;
				else if (c == 'R')
					word = 6;
				if (old != word && word != 0)
					ans += word + "";
				old = word;
			}
			System.out.println(ans);
		}
		scn.close();
	}
}