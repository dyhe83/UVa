#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	for (int cas = 0; cas < N; cas++) {
		int n;
		scanf("%d", &n);
		int max = -1;
		for (int i = 0; i < n; i++) {
			int inp;
			scanf("%d", &inp);
			if (inp > max)
				max = inp;
		}
		printf("Case %d: %d\n", cas + 1, max);
	}
	return 0;
}
