#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	for (int cas = 0; cas < N; cas++) {
		int l, w, h;
		scanf("%d %d %d", &l, &w, &h);
		printf("Case %d: ", cas + 1);
		if (l <= 20 && w <= 20 && h <= 20)
			printf("good\n");
		else
			printf("bad\n");
	}
	return 0;
}
