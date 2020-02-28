#include <cmath>
#include <cstring>
#include <iomanip>
#include <iostream>
#include <numeric>
#include <set>
using namespace std;

int main() {
	cout << "PERFECTION OUTPUT" << endl;
	int N;
	while (true) {
		cin >> N;
		if (N == 0) {
			break;
		}
		set<int> s;
		s.empty();
		for (int i = 1; i < sqrt(N) + 1; i++) {
			if (N % i == 0) {
				s.insert(i);
				s.insert(N / i);
			}
		}
		int sum = accumulate(s.begin(), s.end(), 0) - N;
		string result;
		if (sum == N) {
			result = "PERFECT";
		} else if (sum < N) {
			result = "DEFICIENT";
		} else {  // sum>N
			result = "ABUNDANT";
		}
		cout << setw(5) << N << "  " << result << endl;
	}
	cout << "END OF OUTPUT" << endl;
	return 0;
}