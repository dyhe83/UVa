#include <math.h>
#include <stdio.h>
#include <stdlib.h>
using namespace std;
int k;
int pri[1500];
void prime(void) {
	int i, j, flag;
	pri[0] = 2;
	k = 1;
	for (i = 3; i <= 10141; i = i + 2) {
		flag = 1;
		for (j = 0; j < k; j++)
			if (i % pri[j] == 0) {
				flag = 0;
				break;
			}
		if (flag)
			pri[k++] = i;
	}
}

int main(void) {
	int a, b, flag;
	int ans[10001];
	long i, j, lm, hl;
	prime();
	flag = 0;
	ans[0] = 1;
	i = 0;
	j = 0;
	lm = 0;
	hl = 0;
	for (i = 1; i <= 10000; i++) {
		flag = 1;
		lm = i * i + i + 41;
		hl = sqrt(lm) + 1;
		for (j = 0; j < k && pri[j] < hl; j++)
			if (lm % pri[j] == 0) {
				flag = 0;
				break;
			}
		ans[i] = flag;
	}

	while (~scanf("%d %d", &a, &b)) {
		int sum = 0;
		for (i = a; i <= b; i++)
			sum += ans[i];
		printf("%.2f\n", (1 - (float)(b - a + 1 - (sum)) / (b - a + 1)) * 100);
	}
	return 0;
}