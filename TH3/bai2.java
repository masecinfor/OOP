package ex01.TH3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        themuon themuon1 = new themuon();
        themuon1.nhapSV();
        themuon1.nhapTM();
        themuon1.inTT();
    }
}

class sinhvien {
    protected String hoTen;
    protected int namSinh;
    protected int tuoi;
    protected String lop;
    Scanner input = new Scanner(System.in);

    void nhapSV() {
        System.out.println("Nhap ho ten:");
        hoTen = input.nextLine();
        System.out.println("Nhap nam sinh:");
        namSinh = input.nextInt();
        System.out.println("Nhap tuoi:");
        tuoi = input.nextInt();
        System.out.println("Nhap lop:");
        lop = input.next();
    }
}

class themuon extends sinhvien {
    private int soPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private String soHieuSach;
    Scanner input2 = new Scanner(System.in);
    void nhapTM() {
        System.out.println("Nhap so phieu muon:");
        this.soPhieuMuon = input2.nextInt();
        System.out.println("Nhap ngay muon:");
        this.ngayMuon = input2.nextInt();
        System.out.println("Nhap han tra:");
        this.hanTra = input2.nextInt();
        System.out.println("Nhap so hieu sach:");
        this.soHieuSach = input2.next();
    }
    void inTT() {
        System.out.println("----Thong tin the muon----");
        System.out.println("So phieu muon: " + this.soPhieuMuon);
        System.out.println("Ngay muon:" + this.ngayMuon);
        System.out.println("Ngay tra:" + this.hanTra);
        System.out.println("So hieu sach: " + this.soHieuSach);
        System.out.println("Ho ten: " + super.hoTen);
        System.out.println("Nam sinh: " + super.namSinh);
        System.out.println("Lop: " + super.lop);
    }
}
