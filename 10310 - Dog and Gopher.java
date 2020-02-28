import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			int n = scn.nextInt();
			float gx = scn.nextFloat();
			float gy = scn.nextFloat();
			float dx = scn.nextFloat();
			float dy = scn.nextFloat();
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				float px = scn.nextFloat();
				float py = scn.nextFloat();
				if (dis(gx, gy, px, py) * 2 <= dis(dx, dy, px, py) && !flag) {
					flag = true;
					System.out.printf(
					    "The gopher can escape through the hole at (%.3f,%.3f).",
					    px, py);
					System.out.println();
				}
			}
			if (flag == false)
				System.out.println("The gopher cannot escape.");
		}
		scn.close();
	}

	private static double dis(float a, float b, float x, float y) {
		return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
	}
}