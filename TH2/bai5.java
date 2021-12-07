package ex01.TH2;

public class bai5 {
    public static void main(String[] args) {
        ToanHoc toanHoc = new ToanHoc(6);
        if(toanHoc.isPrime()) {
            System.out.println("----La so nguyen to----");
        }
        if(toanHoc.isPerfectNumber()) {
            System.out.println("----La so hoan hao----");
        }
        if(toanHoc.isSquareNumber()) {
            System.out.println("----La so chinh phuong----");
        }
        System.out.println("----Phan tu fibo thu n = " + toanHoc.fibonaci());
    }
}

class ToanHoc {
    public int n;
    public ToanHoc(int n) {
        this.n = n;
    }
    public boolean isPrime() {
        for(int i=2; i<(int)Math.sqrt(this.n)+1; i++) {
            if(this.n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPerfectNumber() {
        int check = 1;
        for(int i=2; i<this.n; i++) {
            if(this.n % i == 0) {
                check += i;
            }
        }
        if(this.n == check) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isSquareNumber() {
        if((int)Math.sqrt(this.n) == Math.sqrt(this.n)) {
            return true;
        } else {
            return false;
        }
    }
    public int fibonaci() {
        int num1 = 1, num2 = 2, tmp = 0;
        if(this.n == 0) {
            return num2;
        }
        else if(this.n == 1) {
            return num1;
        }
        else {
            for(int i=2; i<=this.n; i++) {
                tmp = num1 + num2;
                num1 = num2;
                num2 = tmp;
            }
            return tmp;
        }
    }
}
