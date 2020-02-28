#include <stdio.h>
#include <cmath>

int main() {
	for (int cas = 1; true; cas++) {
		int n;
		scanf("%d", &n);
		if (n < 0)
			break;
		int x = 1, ans = 0;
		while (x < n) {
			x *= 2;
			ans++;
		}
		printf("Case %d: %d\n", cas, ans);
	}
	return 0;
}