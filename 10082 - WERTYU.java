import java.util.*;
public class Main {
	public static void main(String[] args) {
		String W = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			String inp = scn.nextLine();
			int n = inp.length();
			String ans = "";
			for (int i = 0; i < n; i++)
				if (inp.charAt(i) != ' ')
					ans += W.charAt(W.indexOf(inp.charAt(i)) - 1) + "";
				else
					ans += " ";
			System.out.println(ans);
		}
		scn.close();
	}
}