
package lab1_tuan4;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        dsGiaoDich a = new dsGiaoDich();
        do{
   a.menuChinh();
System.out.print("Lua chon: ");

n= sc.nextInt();
switch(n)
{
case 1 -> {
a.nhapMangDat();
break;
}

case 2 -> {
a.xuatMangDat();
break;
}

case 3 -> {   
a.nhapMangNha();
break;
}

case 4 -> {
a.xuatMangNha();
break;
}

case 5 -> {
 a.size();
break;
}

case 6 -> {
a.tinhTong();
a.trungBinh();
break;
}
case 7 -> {
a.giaoDichThang9();
break;
}

default->{}
}
}
while(n!=0);
}
    }


