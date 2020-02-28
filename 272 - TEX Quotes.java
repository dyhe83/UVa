import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cou = 0;
		while (scn.hasNext()) {
			String inp = scn.nextLine();
			;
			while (true) {
				if (inp.indexOf("\"") < 0)
					break;
				cou = (cou + 1) % 2;
				if (cou == 1)
					inp = inp.replaceFirst("\"", "``");
				else
					inp = inp.replaceFirst("\"", "''");
			}
			System.out.println(inp);
		}
	}
}
