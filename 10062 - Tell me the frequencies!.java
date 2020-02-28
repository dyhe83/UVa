import java.util.*;
class obj {
	int val;
	int cou;
	public obj(int a, int b) {
		this.val = a;
		this.cou = b;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			obj[] v = new obj[256];
			for (int i = 0; i < 256; i++)
				v[i] = new obj(i, 0);
			String inp = scn.nextLine();
			int n = inp.length();
			for (int i = 0; i < n; i++)
				v[Integer.valueOf(inp.charAt(i))].cou++;
			for (int i = 0; i < 256; i++)
				for (int j = i + 1; j < 256; j++)
					if (v[i].cou > v[j].cou) {
						obj t = v[i];
						v[i] = v[j];
						v[j] = t;
					} else if (v[i].cou == v[j].cou)
						if (v[i].val < v[j].val) {
							obj t = v[i];
							v[i] = v[j];
							v[j] = t;
						}
			for (int i = 0; i < 256; i++)
				if (v[i].cou != 0)
					System.out.println(v[i].val + " " + v[i].cou);
			if (scn.hasNext())
				System.out.println();
		}
		scn.close();
	}
}