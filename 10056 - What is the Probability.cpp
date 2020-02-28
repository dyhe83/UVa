#include <stdio.h>
#include <cmath>

int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int m = 0, n = 0;
		double p;
		scanf("%d %lf %d", &n, &p, &m);
		if (p == 0.0f) {
			printf("0.0000\n");
		} else {
			m--;
			double ans = p * pow(1 - p, m) * (1 / (1 - pow(1 - p, n)));
			printf("%.4lf\n", ans);
		}
	}
}
