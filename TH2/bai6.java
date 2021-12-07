package ex01.TH2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("----Nhap bai(1-4): ");
        int bai = input.nextInt();
        System.out.print("-Nhap n:");
        int n = input.nextInt();
        int tmp = 1;
        switch (bai) {
            case 1:
                for(int i=2; i<=n; i++) {
                    tmp += (Math.pow((-1), i))*i;
                }
                System.out.println("--> " + tmp);
                break;
            
            case 2:
                for(int i=2; i<=n; i++) {
                    tmp += factorial(i);
                }
                System.out.println("--> " + tmp);
                break;

            case 3:
                if(n % 2 ==0) {
                    tmp -= 1;
                    for(int i=2; i<n; i+=2) {
                        tmp += i;
                    }
                } else {
                    for(int i=3; i<n; i+=2) {
                        tmp += i;
                    }
                }
                System.out.println("--> " + tmp);
                break;

            case 4:
                double tmp2 = 0;
                for(int i=2; i<=n; i++) {
                    tmp2 += (double)(i-1)/i;
                }
                System.out.println("--> " + tmp2);
                break;
    
            default:
                break;
        }
        input.close();
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}

