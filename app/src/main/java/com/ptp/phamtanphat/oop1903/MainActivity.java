package com.ptp.phamtanphat.oop1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        class : Tap hop nhung doi tuong cung chung voi nhau ve thuoc tinh va hanh vi
        //Khoi tao 1 ca the trong lop con nguoi


//        LopConNguoi nguyenvana = new LopConNguoi("Nguyen Van A");
        //Cap nhat lai du lieu cho thuoc tinh khi khai bao ca the
//       ?

//        LopConNguoi nguyenvanb = new LopConNguoi();
//        nguyenvanb.Ten = "Nguyen Van B";
//
//        LopConNguoi nguyenvanc = new LopConNguoi();
//        nguyenvanc.Ten = "Nguyen Van C";

//        nguyenvana.getTen()?
//        Log.d("BBB",nguyenvana.getTen());

//        Access Modifier ? = pham vi hoat dong cho class , ham (function) , thuoctinh
//        Default , public , private , protected
//        LopCon lopCon = new LopCon();
        //ke thua thuoc tinh va hanh vi khong co ke thua gia' tri
//        lopCon.Ten = "Nguyen Van A";
//        lopCon.Namsinh = "1990";
//     Lopcha :
//        + Ten(String)
//        + Tuoi(int)
//        + Yeu cau nguoi dung truyen du 2 thuoc tinh vao ca the khi khoi tao
//        +  hanh vi in ra gia tri tuoi cho cha
//        +  hanh vi set lai gia tri cho tuoi cha <= 10 thi set lai gia tri cha bang 30
//        +  hanh vi in ra gia tri ten cho cha
//        +  hanh vi set lai gia tri cho ten cha


//     Lopcon :
//        + Que quan(int);
//        + trinh do(String);
//        +  Hanh vi set lai gia tri cho que quan nhap vao so
//        +  Hanh vi in ra du lieu co tu "Quan" + que quan
//        +  Hanh vi set la trinh do (1 - <6) = Hoc mam non (6 - <12) = hoc cap 1 ,(12 - <17) = hoc cap 2, (>=17) Da di lam
//        +  Hanh vi in ra trinh do

//        Cha cha1 = new Cha("Nguyen van a",9);
//        Toast.makeText(this, cha1.getTuoi() + "", Toast.LENGTH_SHORT).show();

        LopCon lopCon = new LopCon(1,"17");

        Toast.makeText(this, lopCon.getTrinhDo(), Toast.LENGTH_SHORT).show();
    }
}
