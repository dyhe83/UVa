#include <stdio.h>
#include <string.h>
int main() {
	int N, sum = 0;
	scanf("%d\n", &N);
	for (int i = 0; i < N; i++) {
		char ins[10];
		scanf("%s", &ins);
		if (strcmp(ins, "donate") == 0) {
			int n;
			scanf("%d\n", &n);
			sum += n;
		} else {
			printf("%d\n", sum);
		}
	}
	return 0;
}
