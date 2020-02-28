import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String a = String.valueOf(scn.nextInt());
			String b = String.valueOf(scn.nextInt());
			if (a.equals("0") && b.equals("0"))
				break;
			if (a.length() > b.length()) {
				String t = a;
				a = b;
				b = t;
			}
			while (a.length() < b.length())
				a = "0" + a;
			int N = a.length(), c = 0, sum = 0, ans = 0;
			for (int i = N - 1; i >= 0; i--) {
				sum = Integer.valueOf(a.charAt(i)) +
				      Integer.valueOf(b.charAt(i)) + c - 96;
				c = sum / 10;
				ans += c;
			}
			if (ans == 0)
				System.out.println("No carry operation.");
			else if (ans == 1)
				System.out.println(ans + " carry operation.");
			else
				System.out.println(ans + " carry operations.");
		}
		scn.close();
	}
}