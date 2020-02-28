#include <stdio.h>
#include <string.h>
int max(int a, int b) {
	if (a > b)
		return a;
	return b;
}

int main() {
	int endp = -1;
	int h[10001];
	int sta, val, tar;
	while (~scanf("%d %d %d", &sta, &val, &tar)) {
		if (tar > endp)
			endp = tar;
		for (int i = sta; i < tar; i++)
			h[i] = max(h[i], val);
	}
	char ans[50005];
	for (int i = 0; i < endp; i++)
		if (h[i] != h[i + 1]) {
			char t[7];
			sprintf(t, "%d", i + 1);
			strcat(ans, t);
			strcat(ans, " ");
			sprintf(t, "%d", h[i + 1]);
			strcat(ans, t);
			strcat(ans, " ");
		}
	ans[strlen(ans) - 1] = '\0';
	printf("%s\n", ans);
	return 0;
}
