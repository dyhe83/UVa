#include <iostream>
using namespace std;
int main() {
	while (true) {
		int n;
		scanf("%d", &n);
		if (n == 0)
			break;
		int px, py;
		scanf("%d %d", &px, &py);
		for (int i = 0; i < n; i++) {
			int x, y, ans;
			scanf("%d %d", &x, &y);
			if (x == px || y == py)
				ans = 0;
			else if (x > px) {
				ans = 1;
				if (y < py)
					ans = 2;
			} else {
				ans = 3;
				if (y < py)
					ans = 4;
			}
			if (ans == 0)
				printf("divisa\n");
			else if (ans == 1)
				printf("NE\n");
			else if (ans == 2)
				printf("SE\n");
			else if (ans == 3)
				printf("NO\n");
			else
				printf("SO\n");
		}
	}
	return 0;
}
