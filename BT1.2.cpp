#include <iostream>
using namespace std;
struct HonSo {
	int TuSo, MauSo, SoNguyen;
}HonSo;
void nhapHonSo()
{
	cout << "Nhap so nguyen" << endl;
	cin >> HonSo.SoNguyen;
	cout << "Nhap tu so" << endl;
	cin >> HonSo.TuSo;
	do {
		cout << "Nhap mau so" << endl;
		cin >> HonSo.MauSo;
		if (HonSo.MauSo == 0)
		{
			cout << "Mau so phai khac 0. Xin kiem tra lai" << endl;

		}
	} while (HonSo.MauSo == 0);
}
void xuatHonSo()
{
	cout << "Hon so:" << HonSo.SoNguyen << " " << HonSo.TuSo << "/" << HonSo.MauSo;
}



int main() {
	nhapHonSo();
	xuatHonSo();

}