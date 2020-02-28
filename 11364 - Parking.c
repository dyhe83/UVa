#include <limits.h>
#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int n, max = -1, min = INT_MAX;
		scanf("%d", &n);
		for (int i = 0; i < n; i++) {
			int inp;
			scanf("%d", &inp);
			if (inp > max)
				max = inp;
			if (inp < min)
				min = inp;
		}
		printf("%d\n", (max - min) * 2);
	}
	return 0;
}
