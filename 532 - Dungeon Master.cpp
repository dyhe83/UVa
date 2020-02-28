#include <memory.h>
#include <array>
#include <iostream>
#include <queue>
using namespace std;
int s[3], e[3];
char map[32][32][32];

int bfs_end() {
	int x, y, z;
	int cou[32][32][32];
	memset(cou, 0, sizeof(cou));
	queue<array<int, 3>> que;
	que.push({e[0], e[1], e[2]});
	cou[e[0]][e[1]][e[2]] = 0;
	while (!que.empty()) {
		x = que.front().at(0);
		y = que.front().at(1);
		z = que.front().at(2);
		que.pop();
		if (map[x - 1][y][z] != '#' && cou[x - 1][y][z] == 0) {
			cou[x - 1][y][z] = cou[x][y][z] + 1;
			que.push({x - 1, y, z});
		}
		if (map[x + 1][y][z] != '#' && cou[x + 1][y][z] == 0) {
			cou[x + 1][y][z] = cou[x][y][z] + 1;
			que.push({x + 1, y, z});
		}
		if (map[x][y - 1][z] != '#' && cou[x][y - 1][z] == 0) {
			cou[x][y - 1][z] = cou[x][y][z] + 1;
			que.push({x, y - 1, z});
		}
		if (map[x][y + 1][z] != '#' && cou[x][y + 1][z] == 0) {
			cou[x][y + 1][z] = cou[x][y][z] + 1;
			que.push({x, y + 1, z});
		}
		if (map[x][y][z - 1] != '#' && cou[x][y][z - 1] == 0) {
			cou[x][y][z - 1] = cou[x][y][z] + 1;
			que.push({x, y, z - 1});
		}
		if (map[x][y][z + 1] != '#' && cou[x][y][z + 1] == 0) {
			cou[x][y][z + 1] = cou[x][y][z] + 1;
			que.push({x, y, z + 1});
		}
		if (cou[s[0]][s[1]][s[2]] != 0)
			return cou[s[0]][s[1]][s[2]];
	}
	return -1;
}

int main() {
	while (true) {
		for (int i = 0; i < 32; i++)
			for (int j = 0; j < 32; j++)
				for (int k = 0; k < 32; k++)
					map[i][j][k] = '#';
		int l, r, c;
		cin >> l >> r >> c;
		if (l == 0 && r == 0 && c == 0)
			break;
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= r; j++) {
				string inp;
				cin >> inp;
				for (int k = 1; k <= c; k++) {
					map[i][j][k] = inp[k - 1];
					if (map[i][j][k] == 'S') {
						s[0] = i;
						s[1] = j;
						s[2] = k;
					} else if (map[i][j][k] == 'E') {
						e[0] = i;
						e[1] = j;
						e[2] = k;
					}
				}
			}
		}
		int ans = bfs_end();
		if (ans > 0)
			cout << "Escaped in " << ans << " minute(s)." << endl;
		else
			cout << "Trapped!" << endl;
	}
	return 0;
}

/*
3 4 5
S....
.###.
.##..
###.#

#####
#####
##.##
##...

#####
#####
#.###
####E

1 3 3
S##
#E#
###

0 0 0
*/
