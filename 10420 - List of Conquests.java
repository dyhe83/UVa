import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		while (N-- > 0) {
			String inp = scn.nextLine();
			inp = inp.trim();
			String t[] = inp.split(" ");
			int x = 1;
			if (map.containsKey(t[0]))
				x = map.get(t[0]) + 1;
			map.put(t[0], x);
		}
		Set<String> keySet = map.keySet();
		for (String key : keySet)
			System.out.println(key + " " + map.get(key));
	}
}
