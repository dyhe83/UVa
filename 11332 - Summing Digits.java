import java.util.*;
public class main {
	static void f(int x) {
		if (x < 10)
			System.out.println(x);
		else {
			int sum = 0;
			while (x != 0) {
				sum += x % 10;
				x /= 10;
			}
			f(sum);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int x = scn.nextInt();
			if (x == 0)
				break;
			f(x);
		}
		scn.close();
	}
}