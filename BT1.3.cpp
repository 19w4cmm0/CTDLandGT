#include <iostream>;

using namespace std;
struct Oxyz {
	float x, y, z;

}Oxyz;

void IP() {
	cout << "Nhap x: " << endl;
	cin >> Oxyz.x;
	cout << "Nhap y: " << endl;
	cin >> Oxyz.y;
	cout << "Nhap z: " << endl;
	cin >> Oxyz.z;
}
void OP() {
	cout << "Diem A= " << "(" << Oxyz.x << ";" << Oxyz.y << ";" << Oxyz.z << ")";
}
int main() {
	IP();
	OP();
}