#include <stdio.h>
#include <cmath>
unsigned int chkPalindorme(unsigned int x) {
	unsigned int y = x, ans = 0;
	while (y > 0) {
		ans = ans * 10 + (y % 10);
		y /= 10;
	}
	if (ans == x)
		return 1;
	return 0;
}

int main() {
	unsigned int N;
	scanf("%d", &N);
	while (N--) {
		unsigned int n;
		scanf("%d", &n);
		unsigned int cou = 0;
		while (true) {
			unsigned int m = n, rev = 0;
			while (m > 0) {
				rev = rev * 10 + (m % 10);
				m /= 10;
			}
			n += rev;
			cou++;
			if (chkPalindorme(n))
				break;
		}
		printf("%d %u\n", cou, n);
	}
	return 0;
}