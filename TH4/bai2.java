package ex01.TH4;

public class bai2 {
    
}

class Diem {
    double x; //hoanh do
    double y; //tung do

    public Diem() {

    }
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void inTTDiem() {
        System.out.println("x:" + x + " ; y:" +y);
    }
    public double tinhKhoangCanh(Diem d) {
        return Math.sqrt(Math.pow(d.x - this.x, 2) + Math.pow(d.y - this.y, 2));
    }
}

class main {
    public static void main(String[] args) {
        Diem d1 = new Diem(3,7);
        Diem d2 = new Diem(9,3);

        System.out.println(d1.tinhKhoangCanh(d2));
    }
}