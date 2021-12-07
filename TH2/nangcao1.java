package ex01.TH2;

import java.util.Scanner;

public class nangcao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap lan luot x, n ,k: ");
        int x = input.nextInt();
        int n = input.nextInt();
        int k = input.nextInt();
        double tmp = 0;

        for(int i=1; i<=n; i++) {
            tmp += (double)(factorial(n)) / (double)((Math.pow(x, n)) + Math.pow(-1, (n+1))*(Math.pow(k, n)));
        }
        System.out.println("--> " + tmp);
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
