import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] d = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] name =
		    new String[] {"Monday", "Tuesday",  "Wednesday", "Thursday",
		                  "Friday", "Saturday", "Sunday"};
		int N = scn.nextInt();
		while (N-- > 0) {
			int mon = scn.nextInt();
			int day = scn.nextInt();
			for (int i = 0; i < mon; i++)
				day += d[i];
			System.out.println(name[(day + 4) % 7]);
		}
	}
}
