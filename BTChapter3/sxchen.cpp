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
void sxchentructiep(int a[], int n)
{
	for (int i = 1; i < n; i++)
	{
		int j = i;
		while (j > 0 && a[j] <= a[j - 1])
		{
			int temp = a[j];
			a[j] = a[j-1];
			a[j-1] = temp;
			j--;
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
	sxchentructiep(a, n);
	xuatMang(a, n);
}
