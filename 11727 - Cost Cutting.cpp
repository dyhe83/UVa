#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	for (int cas = 0; cas < N; cas++) {
		int ans, a[3];
		for (int i = 0; i < 3; i++)
			scanf("%d", &a[i]);
		if (a[0] > a[1])
			if (a[1] > a[2])
				ans = a[1];
			else if (a[0] > a[2])
				ans = a[2];
			else
				ans = a[0];
		else if (a[0] > a[2])
			ans = a[0];
		else if (a[2] > a[1])
			ans = a[1];
		else
			ans = a[2];
		printf("Case %d: %d\n", cas + 1, ans);
	}
	return 0;
}
