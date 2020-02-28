#include <memory.h>
#include <stdio.h>
#include <stdlib.h>
int n;
int path[200][200], drawed[200], color[200];

void biColor(int sta, int c) {
	drawed[sta] = 1;
	color[sta] = c;
	for (int i = sta + 1; i < n; i++)
		if (path[sta][i] && drawed[i] == 0) {
			biColor(i, ((c + 1) % 2));
		}
}

int chkColor(int sta) {
	for (int i = sta + 1; i < n; i++) {
		if (path[sta][i]) {
			if (color[sta] == color[i]) {
				return 0;
			} else {
				if (chkColor(i) == 0) {
					return 0;
				}
			}
		}
	}
	return 1;
}

int main() {
	while (true) {
		scanf("%d", &n);
		if (n == 0)
			break;
		memset(path, 0, sizeof(path));
		memset(drawed, 0, sizeof(drawed));
		memset(color, 0, sizeof(color));
		int loop = 0;
		int sta = 201, l;
		scanf("%d", &l);
		for (int i = 0; i < l; i++) {
			int x, y;
			scanf("%d %d", &x, &y);
			if (x == y)
				loop = 1;
			if (x < sta)
				sta = x;
			path[x][y] = 1;
			path[y][x] = 1;
		}
		if (loop) {
			printf("NOT BICOLORABLE.\n");
		} else {
			biColor(sta, 0);
			if (chkColor(sta) == 1) {
				printf("BICOLORABLE.\n");
			} else {
				printf("NOT BICOLORABLE.\n");
			}
		}
	}
	return 0;
}
