import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			char[] a = scn.nextLine().trim().toCharArray();
			char[] b = scn.nextLine().trim().toCharArray();
			int Na = a.length, Nb = b.length;
			String ans = "";
			for (int i = 0; i < Na; i++)
				for (int j = 0; j < Nb; j++)
					if (a[i] == b[j]) {
						ans += a[i];
						b[j] = ',';
						break;
					}
			System.out.println(strSort(ans));
		}
		scn.close();
	}
	private static String strSort(String str) {
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return (new String(c));
	}
}