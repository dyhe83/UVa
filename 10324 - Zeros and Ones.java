import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = 0;
		while (scn.hasNext()) {
			String seri = scn.nextLine();
			int n = scn.nextInt();
			System.out.println("Case " + (++N) + ":");
			for (int i = 0; i < n; i++) {
				int a = scn.nextInt();
				int b = scn.nextInt();
				if (a > b) {
					int t = a;
					a = b;
					b = t;
				}
				String str = seri.substring(a, b + 1);
				if (str.indexOf("1") != -1 && str.indexOf("0") != -1)
					System.out.println("No");
				else
					System.out.println("Yes");
			}
			scn.nextLine();
		}
		scn.close();
	}
}