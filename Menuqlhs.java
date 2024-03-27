package DOAN;
import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;
public class Menuqlhs {
    public static void main(String[] args){

        int chucNang;
        do{
            System.out.println("-----------------------------QUẢN LÍ HỌC SINH------------------------------------------");
            System.out.println("| 			0:THOÁT CHƯƠNG TRÌNH                 			      |");
            System.out.println("| 			1:NHẬP DANH SÁCH HỌC SINH                                     |");
            System.out.println("| 			2:HIỂN THỊ DANH SÁCH                                          |");
            System.out.println("| 			3:SẮP XẾP THEO ĐIỂM TĂNG DẦN                                  |");
            System.out.println("| 			4:SỬA ĐỔI THÔNG TIN 1 HỌC SINH THEO MÃ HỌC SINH               |");
            System.out.println("| 			5:TÌM DANH SÁCH HỌC SINH CAO ĐIỂM NHẤT                        |");
            System.out.println("| 			6:TÌM HỌC SINH THEO MÃ SỐ                                     |");
            System.out.println("| 			7:THÊM HỌC SINH VÀO DANH SÁCH                                 |");
            System.out.println("| 			8:DANH SÁCH HỌC SINH ĐẬU HOẶC RỚT                             |");
            System.out.println("| 			9:DANH SÁCH HỌC SINH ĐẠT CÁC DANH HIỆU                        |");
            System.out.println("| 			10:XUẤT RA FILE                                               |");
            System.out.println("| 			11:XÓA HỌC SINH TRONG DANH SÁCH THEO MÃ HỌC SINH              |");
            System.out.println("---------------------------------------------------------------------------------------");

            Scanner s = new Scanner(System.in);
            System.out.print("		   	MỜI CHỌN CHỨC NĂNG: ");
            chucNang=s.nextInt();
            String ma;
            switch(chucNang){
                case 1:
                    qlhs.nhapmang();

                    break;
                case 2:
                    qlhs.hthi();
                    break;
                case 3:
                    qlhs.sxdiem();
                    System.out.println("		DANH SÁCH SAU KHI SẮP XẾP ĐIỂM");
                    qlhs.hthi();
                    break;
                case 4:
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Nhập mã học sinh sửa đổi thông tin:");
                     ma=sc.nextLine();
                    System.out.println(qlhs.tk(ma));
                   
                    qlhs.suadoi(ma);
                    System.out.println("		DANH SÁCH SAU KHI SỬA ĐỔI THÔNG TIN");
                    qlhs.hthi();
                    break;
             
                case 5:
                    System.out.println("		DANH SÁCH HỌC SINH CÓ ĐIỂM CAO NHẤT");
                    qlhs.diemcao();
                    break;
                case 6:
                  	 Scanner s1=new Scanner(System.in);
                       System.out.println("Nhập mã học sinh cần tìm:");
                        ma=s1.nextLine();
                       qlhs.tk1(ma);
                      break;
                case 7:
                    qlhs.themhs();
                    System.out.println("		DANH SÁCH SAU THÊM HỌC SINH");
                    qlhs.hthi();
                    break;
                case 8: 
                	qlhs.ketqua();
                	System.out.println(" 		DANH SÁCH HỌC SINH ĐẬU HOẶC RỚT");
                	qlhs.hthi();
                	break;
                case 9:
                	qlhs.danhHieu();
                	System.out.println(" 		DANH SÁCH HỌC SINH ĐẠT CÁC DANH HIỆU");
                	qlhs.hthi();
                	break;
                case 10: 
                	qlhs.xuatHocSinhRaFile("Hocsinh.txt");
                	break;
                case 11:
                    Scanner sx=new Scanner(System.in);
                    System.out.println("Nhập mã học sinh cần xóa: ");
                    String maxoa=sx.nextLine();
                    qlhs.xoahs(maxoa);
                    System.out.println("		DANH SÁCH SAU KHI XÓA HỌC SINH");
                    qlhs.hthi();
                    break;
               
                
                default:
                	System.out.println("Thoát chương trình");
                	break;
            }
        }while(chucNang!=12);
    }
}
