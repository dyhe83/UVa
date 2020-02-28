import java.util.*;
class obj {
	int cou = 0;
	String str = "";
}
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = 0;
		while (scn.hasNext()) {
			N++;
			Set<String> set = new HashSet<String>();
			set.clear();
			int n = scn.nextInt();
			int m = scn.nextInt();
			scn.nextLine();
			obj[] v = new obj[m];
			for (int i = 0; i < n; i++)
				set.add(scn.nextLine().trim().toLowerCase());
			for (int i = 0; i < m; i++) {
				String inp = scn.nextLine();
				v[i] = new obj();
				v[i].str = inp;
				inp = inp.toLowerCase();
				for (int j = 0; j < inp.length(); j++) {
					char c = inp.charAt(j);
					if (c != ' ' & (c<'a' | c> 'z'))
						inp = inp.replace(c + "", " ");
				}
				inp = inp.trim();
				String[] t = inp.split(" ");
				for (int j = 0; j < t.length; j++) {
					if (set.contains(t[j]))
						v[i].cou = v[i].cou + 1;
				}
			}
			for (int i = 0; i < m; i++)
				for (int j = i + 1; j < m; j++)
					if (v[i].cou < v[j].cou) {
						obj t = v[i];
						v[i] = v[j];
						v[j] = t;
					}
			System.out.println("Excuse Set #" + N);
			int past = v[0].cou;
			for (int i = 0; i < m; i++)
				if (past == v[i].cou)
					System.out.println(v[i].str);
				else
					break;
			System.out.println();
		}
		scn.close();
	}
}