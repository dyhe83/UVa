#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int n;
		scanf("%d", &n);
		int ans[10];
		for (int i = 0; i < 10; i++)
			ans[i] = 0;
		for (int i = 1; i <= n; i++) {
			int j = i;
			while (j) {
				ans[j % 10]++;
				j /= 10;
			}
		}
		for (int i = 0; i < 9; i++)
			printf("%d ", ans[i]);
		printf("%d\n", ans[9]);
	}
}
