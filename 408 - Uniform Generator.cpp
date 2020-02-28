#include <memory.h>
#include <stdio.h>

int main() {
	int x, p;
	while (~scanf("%d %d", &x, &p)) {
		int y = 0, cou[p];
		memset(cou, 0, sizeof(cou));
		for (int i = 0; i < p; i++) {
			y = (y + x) % p;
			cou[y]++;
		}
		int flag = 1;
		for (int i = 0; i < p; i++) {
			if (cou[i] == 0) {
				flag = 0;
				break;
			}
		}
		if (flag) {
			printf("%10d%10d%15s\n", x, p, "Good Choice");
		} else {
			printf("%10d%10d%14s\n", x, p, "Bad Choice");
		}
		printf("\n");
	}
	return 0;
}