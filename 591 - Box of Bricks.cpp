#include <stdio.h>

int main() {
	for (int cas = 1; true; cas++) {
		int n;
		scanf("%d", &n);
		if (n == 0)
			break;
		int sum = 0, a[n];
		for (int i = 0; i < n; i++) {
			scanf("%d", &a[i]);
			sum += a[i];
		}
		int ans = 0, avg = sum / n;
		for (int i = 0; i < n; i++)
			if (a[i] > avg)
				ans += (a[i] - avg);
		printf("Set #%d\n", cas);
		printf("The minimum number of moves is %d.\n\n", ans);
	}
	return 0;
}
