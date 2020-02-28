import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cas = 1;
		while (scn.hasNext()) {
			String inp = scn.nextLine(), ans = "UNKNOWN";
			if (inp.equals("#"))
				break;
			else if (inp.equals("HELLO"))
				ans = "ENGLISH";
			else if (inp.equals("HOLA"))
				ans = "SPANISH";
			else if (inp.equals("HALLO"))
				ans = "GERMAN";
			else if (inp.equals("BONJOUR"))
				ans = "FRENCH";
			else if (inp.equals("CIAO"))
				ans = "ITALIAN";
			else if (inp.equals("ZDRAVSTVUJTE"))
				ans = "RUSSIAN";
			System.out.println("Case " + (cas++) + ": " + ans);
		}
	}
}
