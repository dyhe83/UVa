#include <cmath>
#include <cstring>
#include <iostream>
using namespace std;

int main() {
	while (true) {
		string str;
		cin >> str;
		if (str == "0")
			break;
		int sum = 0, n = str.length();
		for (int i = 1; i <= n; i++) {
			sum += (str[n - i] - '0') * (pow(2, i) - 1);
		}
		cout << sum << endl;
	}
	return 0;
}