package ex01.TH4;

import java.util.Scanner;

public class bai1_VD {
    
}

abstract class Person {
    String hoTen;
    int age;
    public void nhapTT() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap tuoi: ");
        age = input.nextInt();
    }
    public abstract void inTT();
    public abstract int tinhLuong();
}

class Student extends Person {

    public int tinhLuong() {
        return 0;
    }

    public void inTT() {
        System.out.println("");
    }
    
}
