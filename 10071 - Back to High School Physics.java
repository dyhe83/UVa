import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println(a * b * 2);
		}
		scn.close();
	}
}