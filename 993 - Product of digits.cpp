#include <memory.h>
#include <iostream>
using namespace std;

int main() {
	int s;
	cin >> s;
	while (s--) {
		unsigned int n;
		cin >> n;
		if (n < 4) {
			cout << n << endl;
		} else {
			int cou[10];
			memset(cou, 0, sizeof(cou));
			for (int i = 9; i > 1; i--) {
				while (n % i == 0) {
					n = n / i;
					cou[i]++;
				}
			}
			if (n == 1) {
				for (int i = 1; i < 10; i++) {
					while (cou[i] != 0) {
						cout << i;
						cou[i]--;
					}
				}
				cout << endl;
			} else {
				cout << -1 << endl;
			}
		}
	}
	return 0;
}