#include <iostream>
#define MAX 100
using namespace std;

void nhapMang(int a[], int n)
{
	
	
		for (int i = 0; i < n; i++)
		{
			cout << "Nhap phan tu thu " << i << ": ";
			cin >> a[i];
			
		}
	
}

void xuatMang(int a[], int n)
{
	for (int i = 0; i < n; i++)
		cout << a[i] << " \t ";
}
void sxchon(int a[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		int min = i;
		for (int j = i + 1; j < n; j++)
			if (a[j] < a[min])
				min = j;
		int temp = a[min];
		a[min] = a[i];
		a[i] = temp;
	}
}


void main()
{
	int a[MAX], i, n;
	cout << "Nhap so luong phan tu: ";
	cin >> n;
	nhapMang(a, n);
	cout << "Mang ban dau: ";
	xuatMang(a, n);
	cout << "Mang sau khi sx: ";
	sxchon(a, n);
	xuatMang(a, n);
}
