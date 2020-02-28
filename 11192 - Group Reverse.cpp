#include <string.h>
#include <algorithm>
#include <iostream>
using namespace std;

int main() {
	while (true) {
		int g = 0;
		string inp;
		cin >> g >> inp;
		if (g == 0)
			break;
		string ans = "";
		int n = inp.length();
		g = n / g;
		for (int i = 0; i < n; i += g) {
			string str = inp.substr(i, g);
			int sn = str.length();
			reverse(str.begin(), str.end());
			ans.append(str);
		}
		cout << ans << endl;
	}
	return 0;
}
