import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.clear();
		while (true) {
			String inp = scn.nextLine();
			if (inp.equals(""))
				break;
			String[] t = inp.split(" ");
			map.put(t[1], t[0]);
		}
		while (scn.hasNext()) {
			String inp = scn.nextLine().trim();
			if (map.containsKey(inp))
				System.out.println(map.get(inp));
			else
				System.out.println("eh");
		}
		scn.close();
	}
}