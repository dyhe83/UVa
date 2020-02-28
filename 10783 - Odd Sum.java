#include <stdio.h>
#include <stdlib.h>
int main() {
	int N;
	scanf("%d", &N);
	for (int cas = 0; cas < N; cas++) {
		int a, b;
		scanf("%d %d", &a, &b);
		if (a % 2 == 0)
			a++;
		if (b % 2 == 0)
			b--;
		printf("Case %d: %d\n", cas + 1, (a + b) * ((b - a) / 2 + 1) / 2);
	}
	return 0;
}
