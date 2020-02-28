#include <iostream>
using namespace std;

int main() {
	int N;
	scanf("%d", &N);
	while (N--) {
		int a, b;
		scanf("%d %d", &a, &b);
		char c = '=';
		if (a > b)
			c = '>';
		else if (a < b)
			c = '<';
		printf("%c\n", c);
	}
	return 0;
}
