#include <stdio.h>
#include <string.h>
int main() {
	float val[256];
	val['W'] = (float)1 / 1;
	val['H'] = (float)1 / 2;
	val['Q'] = (float)1 / 4;
	val['E'] = (float)1 / 8;
	val['S'] = (float)1 / 16;
	val['T'] = (float)1 / 32;
	val['X'] = (float)1 / 64;

	while (true) {
		char inp[201];
		scanf("%s\n", inp);
		if (strcmp(inp, "*") == 0)
			break;
		int n = strlen(inp), ans = 0;
		float sum = 0.0f;
		for (int i = 0; i < n; i++) {
			if (inp[i] == '/') {
				if (sum == 1.0f)
					ans++;
				sum = 0;
			}
			sum += val[inp[i]];
		}
		printf("%d\n", ans);
	}
	return 0;
}