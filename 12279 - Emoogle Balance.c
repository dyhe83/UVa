#include <stdio.h>
int main() {
	for (int cas = 1; true; cas++) {
		int n = 0;
		scanf("%d", &n);
		int pos = 0, neg = 0;
		if (n == 0)
			break;
		for (int i = 0; i < n; i++) {
			int inp = 0;
			scanf("%d", &inp);
			if (inp != 0)
				pos++;
			else
				neg++;
		}
		printf("Case %d: %d\n", cas, pos - neg);
	}
	return 0;
}
