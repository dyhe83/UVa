import java.util.*;
class w {
	char c;
	int num;
	public w(char t, int i) {
		this.c = t;
		this.num = i;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		String inp = "";
		for (int I = 0; I < N; I++)
			inp += scn.nextLine();
		inp = inp.toUpperCase();
		w[] d = new w[26];
		for (int i = 0; i < 26; i++)
			d[i] = new w((char)(65 + i), 0);
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if (c >= 'A' && c <= 'Z')
				d[(int)(c - 'A')].num++;
		}
		for (int i = 0; i < 26; i++)
			for (int j = i + 1; j < 26; j++)
				if (d[i].num >= d[j].num) {
					w t = d[i];
					d[i] = d[j];
					d[j] = t;
				}
		for (int i = 25; d[i].num != 0; i--)
			System.out.println((char)(d[i].c) + " " + d[i].num);
		scn.close();
	}
}