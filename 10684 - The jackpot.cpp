#include <iostream>
using namespace std;

int main() {
	while (1) {
		int n;
		scanf("%d", &n);
		if (n == 0)
			break;
		int sum = 0, max = 0, a[n];
		for (int i = 0; i < n; i++)
			scanf("%d", &a[i]);
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum < 0)
				sum = 0;
			else if (sum > max)
				max = sum;
		}
		if (max > 0)
			printf("The maximum winning streak is %d.\n", max);
		else
			printf("Losing streak.\n");
	}
	return 0;
}