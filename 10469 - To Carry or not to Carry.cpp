#include <stdio.h>

int main() {
	unsigned int n, m;
	while (~scanf("%d %d", &n, &m)) {
		printf("%u\n", n ^ m);
	}
	return 0;
}