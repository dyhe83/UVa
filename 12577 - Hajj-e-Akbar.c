#include <stdio.h>
#include <string.h>
int main() {
	for (int cas = 1; true; cas++) {
		char ins[6];
		scanf("%s", &ins);
		if (strcmp(ins, "Hajj") == 0) {
			printf("Case %d: Hajj-e-Akbar\n", cas);
		} else if (strcmp(ins, "Umrah") == 0) {
			printf("Case %d: Hajj-e-Asghar\n", cas);
		} else {
			break;
		}
	}
	return 0;
}
