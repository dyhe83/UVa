import java.util.*;
class obj {
	int ind, count = 0, sum = 0;
	boolean reg = false;
	int[] spend = new int[11];
	boolean[] pass = new boolean[11];
	public obj(int ind) {
		this.ind = ind;
		for (int i = 0; i < 11; i++) {
			spend[i] = 0;
			pass[i] = false;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		scn.nextLine();
		while (N-- > 0) {
			obj[] data = new obj[101];
			for (int i = 0; i < 101; i++)
				data[i] = new obj(i);
			while (true && scn.hasNext()) {
				int num, plb, time;
				String state, inp = scn.nextLine().trim();
				if (inp.equals(""))
					break;

				String[] t = inp.split(" ");
				num = Integer.valueOf(t[0]);
				plb = Integer.valueOf(t[1]);
				time = Integer.valueOf(t[2]);
				state = t[3];

				data[num].reg = true;
				if (!data[num].pass[plb]) {
					if (state.equals("C")) {
						data[num].pass[plb] = true;
						data[num].spend[plb] = data[num].spend[plb] + time;
						data[num].count = data[num].count + 1;
					}
					if (state.equals("I"))
						data[num].spend[plb] = data[num].spend[plb] + 20;
				}
			}
			for (int i = 0; i < 101; i++)
				if (data[i].reg)
					for (int j = 0; j < 10; j++)
						if (data[i].pass[j])
							data[i].sum = data[i].sum + data[i].spend[j];
			for (int i = 0; i < 101; i++) {
				for (int j = i + 1; j < 101; j++)
					if (data[i].count < data[j].count)
						data[j] = swap(data[i], data[i] = data[j]);
					else if (data[i].count == data[j].count)
						if (data[i].sum > data[j].sum)
							data[i] = swap(data[j], data[j] = data[i]);
						else if (data[i].sum == data[j].sum)
							if (data[i].ind > data[j].ind)
								data[i] = swap(data[j], data[j] = data[i]);
				if (data[i].reg)
					System.out.println(data[i].ind + " " + data[i].count + " " +
					                   data[i].sum);
			}
			if (N != 0)
				System.out.println();
		}
		scn.close();
	}

	private static obj swap(obj a, obj b) { return a; }
}