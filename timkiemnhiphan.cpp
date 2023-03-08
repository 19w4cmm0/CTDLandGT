#include <iostream>
using namespace std;

int timkiemnhiphan(int a[], int x, int n) {
	int left = 0;
	int right = n-1;
	int mid;
	 do {
		mid = (left + right) / 2;
		if (x == a[mid])
			return mid;
		else if (x < a[mid])
			right = mid - 1;
		else
			left = mid + 1;
	 } while (left <= right);
	return -1;

}
;

int main()
{
	
	int x, mid = 0, left = 0, right = 0, result;
	int n = 6;
	int a[] = {1,2,3,4,5,6 };
	
	cout << "Nhap gia tri can tim: ";
	cin >> x;
	result = timkiemnhiphan(a, x, n);
	if (result == -1)
		cout << "Khong tim thay x!";
	else
		cout << "vi tri cua " << x << " la: " << result;
	return 0;
}