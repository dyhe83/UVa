import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		BigDecimal a;
		int b;
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			a = scn.nextBigDecimal();
			b = scn.nextInt();
			a = a.pow(b);
			String ans = a.toPlainString();
			if (ans.charAt(0) == '0' && ans.charAt(1) == '.')
				ans = ans.substring(1, ans.length());
			int n = ans.length() - 1;
			while (ans.charAt(n) == '0' || ans.charAt(n) == '.')
				n--;
			ans = ans.substring(0, n + 1);
			System.out.println(ans);
		}
		scn.close();
	}
}