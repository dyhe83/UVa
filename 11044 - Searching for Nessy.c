#include <stdio.h>
#include <cmath>
int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int a, b;
		scanf("%d %d", &a, &b);
		printf("%d\n", (int)(ceil((a - 2) / 3.0f) * ceil((b - 2) / 3.0f)));
	}
	return 0;
}
