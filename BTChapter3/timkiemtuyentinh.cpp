#include <iostream>
#define MAX 100
using namespace std;

int nhapMang(int a[], int n)
{


	for (int i = 0; i < n; i++)
	{
		cout << "Nhap phan tu thu " << i << ": ";
		cin >> a[i];
		if (a[i] == 0) {
			cout << "Ket thuc mang! ";
			return 0;
		}
	}

}

void xuatMang(int a[], int n)
{
	for (int i = 0; i < n; i++)
		cout << a[i] << " \t ";
}

int search(int a[], int n, int x)
{
	int i = 0;
	while (i < n && a[i] != x)
		i++;
	if (i == n)
		return -1;
	else
		return i;
}

int main()
{
	int a[MAX], i, n, x;
	cout << "Nhap so phan tu cua mang: ";
	cin >> n;
	nhapMang(a, n);
	xuatMang(a, n);
	cout << "Nhap gia tri can tim: ";
	cin >> x;
	int result = search(a, n, x);
	if (result == -1)
		cout << "khong tim thay";
	else
		cout << "Vi tri: " << result;
}