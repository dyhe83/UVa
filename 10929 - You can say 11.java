import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String inp = scn.nextLine();
			if (inp.equals("0"))
				break;
			int[] a = new int[2];
			a[0] = 0;
			a[1] = 0;
			for (int i = 0; i < inp.length(); i++)
				a[i % 2] += inp.charAt(i) - '0';
			int x = (a[1] - a[0]);
			if (x < 0)
				x = -x;
			if (x % 11 == 0)
				System.out.println(inp + " is a multiple of 11.");
			else
				System.out.println(inp + " is not a multiple of 11.");
		}
	}
}
