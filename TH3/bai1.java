package ex01.TH3;

import java.util.Scanner;

public class bai1 { //class VanDung
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi();
        nguoi1.nhapTT();
        nguoi1.inTT();
    }
}

class Nguoi {
    private String hoTen;
    private String diaChi;
    private int namSinh;
    Scanner input = new Scanner(System.in);
    void nhapTT() {
        System.out.println("----Nhap thong tin----");
        System.out.print("Nhap ho ten: ");
        this.hoTen = input.next();
        System.out.print("Nhap dia chi: ");
        this.diaChi = input.next();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = input.nextInt();
    }
    void inTT() {
        System.out.println("----Thong tin nguoi----");
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Nam sinh: " + this.namSinh);
    }
}