package ex01.TH3;

import java.util.Scanner;

public class nangcao1 { //class Main
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac();
        tamGiac.nhapCanh();
        System.out.println("--Chu vi la: " + tamGiac.chuVi());
        System.out.println("--Dien tich la: " + tamGiac.dienTich());
    }
}

class DaGiac {
    int soCanh;
    float[] kichThuocCanh = new float[100];
    Scanner input = new Scanner(System.in);
    public int getSoCanh() {
        return soCanh;
    }
    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    void nhapCanh() {
        for (int i=0; i<soCanh; i++) {
            System.out.print("Nhap canh " + i + ": ");
            this.kichThuocCanh[i] = input.nextFloat();
        }
    }
    float chuVi() {
        float tmp=0;
        for (int i=0; i<soCanh; i++) {
            tmp += this.kichThuocCanh[i];
        }
        return tmp;
    }
    void inCanh() {
        System.out.println("----Cac canh da giac----");
        for (int i=0; i<soCanh; i++) {
            System.out.println("Canh " + i + "= " + this.kichThuocCanh[i]);
        }
    }
}

class TamGiac extends DaGiac {
    @Override
    void nhapCanh() {
        for (int i=0; i<3; i++) {
            System.out.print("Nhap canh " + i + ": ");
            super.kichThuocCanh[i] = input.nextFloat();
        }
    }

    @Override
    float chuVi() {
        float tmp=0;
        for (int i=0; i<3; i++) {
            tmp += super.kichThuocCanh[i];
        }
        return tmp;
    }

    @Override
    void inCanh() {
        System.out.println("----Cac canh tam giac----");
        for (int i=0; i<3; i++) {
            System.out.println("Canh " + i + "= " + super.kichThuocCanh[i]);
        }
    }

    double dienTich() {
        float p = this.chuVi()/2;
        return Math.sqrt(p*(p-super.kichThuocCanh[0])*(p-super.kichThuocCanh[1])*(p-super.kichThuocCanh[2]));
    }
}