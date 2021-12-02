package ex01.TH2;

import java.util.Scanner;

public class bai1234 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bài: ");
        int tmp = input.nextInt();
        int i;
        switch (tmp) {
            case 1:
                System.out.print("Nhap i:");
                i = input.nextInt();
                i++; System.out.println("Gia tri tang: " + i);
                i-=2; System.out.println("Gia tri giam: " + i);
                break;
        
            case 2:
                System.out.println("Nhap n:");
                int n = input.nextInt();
                System.out.println(Integer.toBinaryString(n));
                break;

            case 3:
                System.out.println("Nhap ngay, thang, nam:");
                int day, month, year;
                day = input.nextInt();
                month = input.nextInt();
                year = input.nextInt();
                switch(month) {
                    case 2: 
                        day += 31;
                        break;
                    case 3: 
                        day += 31+28;
                        break;
                    case 4:
                        day += 31+28+31;
                        break;
                    case 5: 
                        day += 31+28+31+30;
                        break;
                    case 6:
                        day += 31+28+31+30+31;
                        break;
                    case 7: 
                        day += 31+28+31+30+31+30;
                        break;
                    case 8:
                        day += 31+28+31+30+31+30+31;
                        break;
                    case 9:
                        day += 31+28+31+30+31+30+31+31;
                        break;
                    case 10: 
                        day += 31+28+31+30+31+30+31+31+30;
                        break;
                    case 11:
                        day += 31+28+31+30+31+30+31+30+31+31;
                        break;
                    case 12: 
                        day += 31+28+31+30+31+30+31+30+31+30;
                        break;
                    default:
                        break;
                }
                if(year%4==0 && (year%100!=0) && month>2) {
                    day += 1;
                }
                System.out.println(day);
                break;
            default:
                break;
        }
    }
}
