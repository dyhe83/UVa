import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		while (N-- > 0) {
			int n = scn.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = scn.nextInt();
				sum += a * c;
			}
			System.out.println(sum);
		}
		scn.close();
	}
}