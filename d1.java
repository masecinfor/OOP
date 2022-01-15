import java.util.ArrayList;
import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        SieuThi st = new SieuThi();
        KhachHang kh = new KhachHang();
        HoaDon hd = new HoaDon();
        int tmp = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\n\n==MENU==");
            System.out.println("\t--1.Nhap san pham");
            System.out.println("\t--2.Them khach hang");
            System.out.println("\t--3.Thay doi thong tin KH");
            System.out.println("\t--4.In danh sach san pham");
            System.out.println("\t--5.In danh sach khach hang");
            System.out.println("\t--6.Nhap hoa don");
            System.out.println("\t--7.In hoa don");
            System.out.println("Chon chuc nang:");
            tmp = input.nextInt();
            input.nextLine();
            switch(tmp) {
                case 1:
                    st.nhapSP();
                    break;
                case 2:
                    kh.nhapKH();
                    break;
                case 3:
                    kh.suaKH();
                    break;
                case 4:
                    st.inSP();
                    break;
                case 5:
                    kh.inKH();
                    break;
                case 6:
                KhachHang tmp2 = new KhachHang();
                int tmp3 = 0;
                System.out.print("---Nhap maKH:");
                tmp2.maKH = input.nextLine();
                tmp2.gia = 0;
                for(int i=0; i<kh.listKH.size(); i++) {
                    if(kh.listKH.get(i).maKH.equals(tmp2.maKH)) {
                        do{
                            System.out.print("---Nhap maSP:");
                            tmp2.maSP = input.nextLine();
                            for(int j=0; j<st.listSP.size(); j++) {
                                if(st.listSP.get(j).maSP.equals(tmp2.maSP)) {
                                    System.out.print("---Nhap so luong:");
                                    tmp2.soLuong = input.nextInt();
                                    st.listSP.get(j).soLuong -= tmp2.soLuong;
                                    tmp2.gia += tmp2.soLuong*st.listSP.get(j).gia;
                                    System.out.println("====> Nhap thanh cong");
                                    break;
                                }
                            }
                            System.out.print("Nhap them san pham(0/1):");
                            tmp3 = input.nextInt();
                            input.nextLine();
                        } while(tmp3 == 1);
                        hd.listHD.add(tmp2);
                        break;
                    }
                }
                System.out.println("--->Khong tim thay maKH");
                    break;
                case 7:
                    hd.inHD();
                    break;
                default:
                    break;
            }
        } while(true);
    }
}

class SieuThi extends SanPham{
    protected ArrayList<SanPham> listSP = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void nhapSP() {
        SanPham tmp = new SanPham();
        System.out.print("----Nhap ma san pham:");
        tmp.maSP = input.nextLine();
        System.out.print("----Nhap so luong:");
        tmp.soLuong = input.nextInt();
        input.nextLine();
        for(int i=0; i<listSP.size(); i++) {
            if(listSP.get(i).maSP.equals(tmp.maSP)) {
                listSP.get(i).soLuong += tmp.soLuong;
                return;
            }
        }

        System.out.print("----Nhap ten san pham:");
        tmp.tenSP = input.nextLine();
        System.out.print("----Nhap gia:");
        tmp.gia = input.nextInt();
        System.out.print("----Nhap ngay san xuat:");
        tmp.ngaySX = input.nextInt();
        input.nextLine();
        listSP.add(tmp);
    }
    
    public void inSP() {
        System.out.println("\t====Danh sach san pham====");
        System.out.println("\tMaSP\tTenSP\t\tSoLuong\t\tGia");
        for(int i=0; i<listSP.size(); i++) {
            System.out.println("\t"+ listSP.get(i).maSP + "\t" + listSP.get(i).tenSP + "\t\t" + listSP.get(i).soLuong + "\t\t" + listSP.get(i).gia);
        }
        input.nextLine();
    }
}

class SanPham{
    protected String maSP;
    protected String tenSP;
    protected int gia;
    protected int ngaySX;
    protected int soLuong;
}

class KhachHang extends SieuThi{
    protected ArrayList<KhachHang> listKH = new ArrayList<>();
    protected ArrayList<KhachHang> listHD = new ArrayList<>();
    protected String maKH;
    protected String tenKH;
    protected int namSinh;

    protected String to;
    protected String phuong;
    protected String quan;
    protected String thanhPho;
    protected String diaChi;

    Scanner input = new Scanner(System.in);

    public void nhapKH() {
        KhachHang tmp = new KhachHang();
        System.out.print("--Nhap ma KH:");
        tmp.maKH = input.nextLine();
        do {
            for(int i=0; i<listKH.size(); i++) {
                if(listKH.get(i).maKH.equals(tmp.maKH)) {
                    System.out.print("-Da ton tai, nhap lai:");
                    tmp.maKH = input.nextLine();
                    break;
                }
            }
            break;
        } while(true);

        System.out.print("--Nhap ten KH:");
        tmp.tenKH = input.nextLine();
        System.out.print("--Nhap nam sinh:");
        tmp.namSinh = input.nextInt();
        input.nextLine();
        System.out.print("---Nhap to:");
        tmp.to = input.nextLine();
        System.out.print("---Nhap phuong:");
        tmp.phuong = input.nextLine();
        System.out.print("---Nhap quan:");
        tmp.quan = input.nextLine();
        System.out.print("---Nhap thanh pho:");
        tmp.thanhPho = input.nextLine();
        tmp.diaChi = tmp.to + ", " + tmp.phuong + ", " + tmp.quan + ", " + tmp.thanhPho;
        listKH.add(tmp);
    }

    public void suaKH() {
        KhachHang tmp = new KhachHang();
        int tmp2 = 0;
        System.out.print("--Nhap ma KH can sua:");
        tmp.maKH = input.nextLine();
        for(int i=0; i<listKH.size(); i++) {
            if(listKH.get(i).maKH.equals(tmp.maKH)) {
                System.out.print("-Doi ten khach hang(0 or 1):");
                tmp2 = input.nextInt();
                input.nextLine();
                if(tmp2 == 1) {
                    System.out.print("--Nhap ten moi:");
                    tmp.tenKH = input.nextLine();
                    listKH.get(i).tenKH = tmp.tenKH;
                }
                System.out.print("-Doi nam sinh khach hang(0 or 1):");
                tmp2 = input.nextInt();
                input.nextLine();
                if(tmp2 == 1) {
                    System.out.print("--Nhap nam sinh moi:");
                    tmp.namSinh = input.nextInt();
                    listKH.get(i).namSinh = tmp.namSinh;
                }
                return;
            }
        }
        System.out.println("---> Khong tim thay ma KH.");
    }

    public void inKH() {
        System.out.println("\t====Danh sach san pham====");
        System.out.println("\tMaKH\tTenKH\t\tNamsinh\t\tDiaChi");
        for(int i=0; i<listKH.size(); i++) {
            System.out.println("\t"+ listKH.get(i).maKH + "\t" + listKH.get(i).tenKH+ "\t\t" + listKH.get(i).namSinh + "\t\t" + listKH.get(i).diaChi);
        }
        input.nextLine();
    }
}   

class HoaDon extends KhachHang {
    protected ArrayList<KhachHang> listHD = new ArrayList<>();
    private int tmp = 0;

    public void inHD() {
        for(int i = 0; i<listHD.size(); i++) {
            tmp = listHD.get(i).gia;
            for(int j=i; j<listHD.size(); j++) {
                if(tmp>listHD.get(j).gia) {
                    listHD.get(i).gia = listHD.get(j).gia;
                    listHD.get(j).gia = tmp;
                }
            }
        }
        System.out.println("\t====Danh sach hoa don====");
        System.out.println("\tMaKH\t\tSotien");
        for(int i=0; i<listHD.size(); i++) {
            System.out.println("\t" + listHD.get(i).maKH + "\t\t" + listHD.get(i).gia);
        }
        input.nextLine();
    }
}
// class HoaDon extends SieuThi {
//     protected ArrayList<SieuThi> listHD = new ArrayList<>();
//     SieuThi tmp = new SieuThi();
//     Scanner input = new Scanner(System.in);
//     private int tmp2;

//     public void nhapHD() {
//         System.out.println("---Nhap maKH:");
//         tmp.maKH = input.nextLine();
//         tmp.gia = 0;
//         for(int i=0; i<super.listKH.size(); i++) {
//             if(super.listKH.get(i).maKH.equals(tmp.maKH)) {
//                 do{
//                     System.out.println("---Nhap maSP:");
//                     tmp.maSP = input.nextLine();
//                     for(int j=0; j<super.listSP.size(); j++) {
//                         if(listSP.get(j).maSP.equals(tmp.maSP)) {
//                             System.out.println("---Nhap so luong:");
//                             tmp.soLuong = input.nextInt();
//                             super.listSP.get(j).soLuong -= tmp.soLuong;
//                             tmp.gia += tmp.soLuong*listSP.get(j).gia;
//                             System.out.println("====> Nhap thanh cong");
//                             break;
//                         }
//                     }
//                     System.out.println("Nhap them san pham(0/1):");
//                     tmp2 = input.nextInt();
//                 } while(tmp2 == 1);
//                 listHD.add(tmp);
//                 return;
//             }
//         }
//         System.out.println("--->Khong tim thay maKH");
//     }

//     public void inHD() {
//         System.out.println("====Danh sach hoa don====");
//         System.out.println("\tMaKH\t\tSotien");
//         for(int i=0; i<listKH.size(); i++) {
//             System.out.println("\t" + listHD.get(i).maKH + "\t\t" + listHD.get(i).gia);
//         }
//     }
// }

