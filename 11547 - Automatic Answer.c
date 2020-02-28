#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int n;
		scanf("%d", &n);
		n = n * 567 / 9 + 7492;
		n = n * 5 - 498;
		n = (n / 10) % 10;
		if (n < 0)
			n = -n;
		printf("%d\n", n);
	}
	return 0;
}
