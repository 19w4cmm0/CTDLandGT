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
void xepTang(int a[], int n)
{

	for (int i = 0; i < n - 1; i++)
	{
	 if( a[i] % 2 != 0)
		for (int j = i + 1; j < n; j++)
		{
			if (a[i] < a[j])
			{
				int tam = a[i];
				a[i] = a[j];
				a[j] = tam;
			}
		}

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
	xepTang(a, n);
	xuatMang(a, n);
}
