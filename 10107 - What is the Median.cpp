#include <memory.h>
#include <stdio.h>
#include <algorithm>
int main() {
	int inp;
	int a[1000001];
	memset(a, 0, sizeof(a));
	for (int n = 0; ~scanf("%d", &inp); n++) {
		a[n] = inp;
		std::sort(a, a + n + 1);
		if (n % 2 == 0)
			printf("%d\n", a[n / 2]);
		else
			printf("%d\n", (a[n / 2] + a[n / 2 + 1]) / 2);
	}
	return 0;
}