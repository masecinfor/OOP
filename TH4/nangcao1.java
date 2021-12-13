package ex01.TH4;

import java.util.Scanner;

public class nangcao1 {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc(2, 3);
        SoPhuc sp2 = new SoPhuc(3, 4);
        SoPhuc C1 = new SoPhuc();
        SoPhuc C2 = new SoPhuc();

        C1 = sp1.congSoPhuc(sp2);
        C1.inSoPhuc();

        C2 = sp1.nhanSoPhuc(sp2);
        C2.inSoPhuc();
    }
}

class SoPhuc {
    double phanThuc;
    double phanAo;
    public SoPhuc() {

    }
    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    public void nhapSoPhuc() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        this.phanThuc = input.nextDouble();
        System.out.print("Nhap phan ao: ");
        this.phanAo = input.nextDouble();
    }
    public void inSoPhuc() {
        System.out.println("So phuc: " + this.phanThuc + " + " + this.phanAo + "i");
    }
    SoPhuc congSoPhuc(SoPhuc sp) {
        //z + z' = (a + a') + (b + b')i
        SoPhuc tmp = new SoPhuc();
        tmp.phanThuc = this.phanThuc + sp.phanThuc;
        tmp.phanAo = this.phanAo + sp.phanAo;
        return tmp;  
    }
    SoPhuc nhanSoPhuc(SoPhuc sp) {
        //z . z' = aa' - bb' + (ab' + a'b)i
        SoPhuc tmp = new SoPhuc();
        tmp.phanThuc = this.phanThuc*sp.phanThuc - this.phanAo*sp.phanAo;
        tmp.phanAo = this.phanThuc*sp.phanAo + sp.phanThuc*this.phanAo;
        return tmp;
    }
}
