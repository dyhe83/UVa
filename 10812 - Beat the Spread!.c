#include <stdio.h>
#include <stdlib.h>
int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int a, b;
		scanf("%d %d", &a, &b);
		if ((a + b) % 2 == 0 && a >= b)
			printf("%d %d\n", ((long)a + b) / 2, ((long)a - b) / 2);
		else
			printf("impossible\n");
	}
	return 0;
}
