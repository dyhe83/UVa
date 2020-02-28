#include <cmath>
#include <iostream>
using namespace std;
int main() {
	while (true) {
		string inp;
		cin >> inp;
		if (inp.compare("0:00") == 0)
			break;
		float h = stoi(inp.substr(0, inp.find(':')));
		float m = stoi(inp.substr(inp.find(':') + 1, inp.length() - 1));
		if (h == 12.0f)
			h = 0;
		h = (h + m / 60) * 30;
		m *= 6;
		float ang = abs(h - m);
		ang = min(ang, 360 - ang);
		if (ang > 180.0f)
			ang = 360 - ang;
		printf("%.3f\n", ang);
	}
	return 0;
}
