import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while (scn.hasNext()) {
			String inp = scn.nextLine().toLowerCase(), ans = "";
			for (int i = 0; i < inp.length(); i++) {
				char c = inp.charAt(i);
				if (c != ' ')
					ans += word.charAt(word.indexOf(c) - 2) + "";
				else
					ans += " ";
			}
			System.out.println(ans);
		}
		scn.close();
	}
}