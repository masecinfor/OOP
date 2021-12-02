package ex01.TH3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("----Can nhap n ho----");
       int n = input.nextInt();
       BienLai bienLai[] = new BienLai[n];
        for (BienLai bLai : bienLai) {
            bLai = new BienLai();
            bLai.nhapKH();
            bLai.nhapBL();
            bLai.inBL();
        }
        input.close();
    }
}

class KhachHang {
    String tenChuHo;
    String soNha;
    String soCongTo;
    Scanner input = new Scanner(System.in);
    void nhapKH() {
        System.out.println("----Nhap thong tin KH----");
        System.out.print("Nhap ten chu ho:");
        tenChuHo = input.next();
        System.out.print("Nhap so nha:");
        soNha = input.next();
        System.out.print("Nhap so cong to:");
        soCongTo = input.next();
    }
    void inKH() {
        System.out.println("----Thong tin----");
        System.out.println("Ten chu ho: " + this.tenChuHo);
        System.out.println("So nha: " + this.soNha);
        System.out.println("So cong to: " + this.soCongTo);
    }
}

class BienLai extends KhachHang{
    private int chiSoCu;
    private int chiSoMoi;
    private int soTienTra;
    Scanner input2 = new Scanner(System.in);
    protected void nhapBL() {
        System.out.print("Nhap chi so cu: ");
        chiSoCu = input2.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi = input2.nextInt();
        soTienTra = (chiSoMoi-chiSoCu)*850000;
    }
    protected void inBL() {
        System.out.println("----Thong tin hoa don----");
        System.out.println("Ten chu ho: " + super.tenChuHo);
        System.out.println("So nha: " + super.soNha);
        System.out.println("So cong to: " + super.soCongTo);
        System.out.println("Chi so cu: " + this.chiSoCu);
        System.out.println("Chi so moi: " + this.chiSoMoi);
        System.out.println("So tien phai tra: " + this.soTienTra);
    }
}
