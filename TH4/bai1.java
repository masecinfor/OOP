package ex01.TH4;

public class bai1 {
    
}

class VanDung {
    public static void main(String[] args) {
        if(ToanHoc.isPrime(5)) {
            System.out.println("5 la SNT");
        } else {
            System.out.println("5 khong la SNT");
        }
    }
}

class ToanHoc {
    protected int n;
    public ToanHoc() {
        
    }
    public ToanHoc(int n) {
        this.n = n;
    }
    public static boolean isPrime(int k) {
        for(int i=2; i<(int)Math.sqrt(k)+1; i++) {
            if(k % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectNumber(int n) {
        int check = 1;
        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                check += i;
            }
        }
        if(n == check) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSquareNumber(int n) {
        if((int)Math.sqrt(n) == Math.sqrt(n)) {
            return true;
        } else {
            return false;
        }
    }
    public static int fibonaci(int n) {
        int num1 = 1, num2 = 2, tmp = 0;
        if(n == 0) {
            return num2;
        }
        else if(n == 1) {
            return num1;
        }
        else {
            for(int i=2; i<=n; i++) {
                tmp = num1 + num2;
                num1 = num2;
                num2 = tmp;
            }
            return tmp;
        }
    }
    public static double tinhTong(int n) {
        double tmp2 = 0;
        for(int i=2; i<=n; i++) {
            tmp2 += (double)(i-1)/i;
        }
        return tmp2;
    }
}
