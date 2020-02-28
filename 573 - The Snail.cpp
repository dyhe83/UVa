#include <stdio.h>
int main() {
	while (true) {
		float h, u, d, f;
		scanf("%f %f %f %f", &h, &u, &d, &f);
		if (h == 0)
			break;
		f = u * f / 100;
		float pos = 0;
		int day = 1;
		while (true) {
			pos += u;
			if (pos > h)
				break;
			u -= f;
			if (u <= 0.0f)
				u = 0;
			pos -= d;
			if (pos < 0.0f)
				break;
			day++;
		}
		if (pos > 0.0f)
			printf("success on day %d\n", day);
		else
			printf("failure on day %d\n", day);
	}
	return 0;
}
