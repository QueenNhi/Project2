package DOAN;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class qlhs {

	public static int dt[], sl, dv[], ta[];
	public static float dtb[];
	public static int ns[];
	public static String ht[];
	public static String mhs[];
	public static String kq[];
	public static String danhHieu[];
	
	public static int nhapdiem() {
		int tg;
		Scanner sc = new Scanner(System.in);
		tg = sc.nextInt();
		return tg;
	}

	public static int nhapns() {
		int tg;
		Scanner sc = new Scanner(System.in);
		tg = sc.nextInt();
		return tg;
	}

	public static String nhapht() {
		Scanner sc = new Scanner(System.in);
		String tg = sc.nextLine();
		return tg;
	}

	public static String nhapmhs() {
		Scanner sc = new Scanner(System.in);
		String tg = sc.nextLine();
		return tg;
	}

	public static void nhapmang() {
		int i;
		dv = new int[10];
		dt = new int[10];
		ta = new int[10];
		ns = new int[5];
		ht = new String[100];
		mhs = new String[10];
		System.out.println("Nhập số lượng học sinh:");
		Scanner sc = new Scanner(System.in);
		sl = sc.nextInt();
		for (i = 0; i < sl; i++) {
			System.out.println("Nhập mã học sinh thứ " + (i + 1) + " : ");
			mhs[i] = nhapmhs();
			System.out.println("Nhập họ tên học sinh thứ " + (i + 1) + " : ");
			ht[i] = nhapht();
			System.out.println("Nhập năm sinh học sinh thứ " + (i + 1) + " : ");
			ns[i] = nhapns();
			if (ns[i] > 2023) {
				System.out.println("Nhập lại năm sinh");
				ns[i] = nhapns();
			}
			System.out.println("Nhập điểm toán học sinh thứ " + (i + 1) + " : ");
			dv[i] = nhapdiem();
			if (dv[i] > 10) {
				System.out.println("Nhập lại điểm toán");
				dv[i] = nhapns();
			}
			System.out.println("Nhập điểm văn học sinh thứ " + (i + 1) + " : ");
			dt[i] = nhapdiem();
			if (dt[i] > 10) {
				System.out.println("Nhập lại điểm văn");
				dt[i] = nhapns();
			}
			System.out.println("Nhập điểm anh học sinh thứ " + (i + 1) + " : ");
			ta[i] = nhapdiem();
			if (ta[i] > 10) {
				System.out.println("Nhập lại điểm anh");
				ta[i] = nhapns();
			}
		}
	}

	public static void hthi() {
		dtb = new float[10];
		System.out.println("       		DANH SÁCH HỌC SINH");
		for (int j = 0; j <= 74; j++)
			System.out.printf("_");
		System.out.printf("\n");
		System.out.printf("%-13s %-18s %-10s  %-8s %-6s %-7s %-6s \n", "Mã học sinh", "Họ và Tên", "Năm sinh", "Toán",
				"Văn", "Anh", "ĐTB");
		for (int i = 0; i < sl; i++) {
			dtb[i] = ((dv[i] + dt[i] + ta[i]) / 3);
			System.out.printf("____________|__________________|__________|_______|_______|_______|_______|\n");
			System.out.printf("%-13s %-18s %-10d  %-8d %-8d %-6d %-7.2f  \n", mhs[i].toUpperCase(), ht[i].toUpperCase(),
					ns[i], dv[i], dt[i], ta[i], dtb[i]);
		}
		for (int j = 0; j <= 74; j++)
			System.out.printf("_");
		System.out.printf("\n");
	}

	public static void dtrungbinh() {
		dtb = new float[10];
		for (int i = 0; i < sl; i++) {
			dtb[i] = ((dv[i] + dt[i] + ta[i]) / 3);
		}
	}
	public static void sxdiem() {
		float tg = dtb[0];
		int tg1 = dv[0], tg2 = dt[0], tg3 = ta[0], tg6 = ns[0];
		String tg4 = ht[0], tg5 = mhs[0];
		for (int i = 0; i < sl - 1; i++) {
			for (int j = i + 1; j < sl; j++) {
				if (dtb[i] < dtb[j]) {
					tg = dtb[j];
					dtb[j] = dtb[i];
					dtb[i] = tg;
					tg1 = dv[j];
					dv[j] = dv[i];
					dv[i] = tg1;
					tg2 = dt[j];
					dt[j] = dt[i];
					dt[i] = tg2;
					tg3 = ta[j];
					ta[j] = ta[i];
					ta[i] = tg3;
					tg4 = ht[j];
					ht[j] = ht[i];
					ht[i] = tg4;
					tg5 = mhs[j];
					mhs[j] = mhs[i];
					mhs[i] = tg5;
					tg6 = ns[j];
					ns[j] = ns[i];
					ns[i] = tg6;
				}
			}
		}
	}

	public static void diemcao() {
		int i;
		float max = dtb[0];
		sxdiem();
		System.out.printf("%-13s %-18s %-10s  %-8s %-6s %-7s %-6s \n", "Mã học sinh", "Họ và Tên", "Năm sinh", "Toán",
				"Văn", "Anh", "ĐTB");
		for (i = 0; i < sl; i++) {
			if (dtb[i] == max) {
				System.out.printf("____________|__________________|__________|_______|_______|_______|_______|\n");
				System.out.printf("%-13s %-18s %-10d  %-8d %-8d %-6d %-7.2f \n", mhs[i].toUpperCase(),
						ht[i].toUpperCase(), ns[i], dv[i], dt[i], ta[i], dtb[i]);
			} else
				break;
		}
	}

	public static int tk(String ma) {
		int i;
		for (i = 0; i < sl; i++) {
			if (mhs[i].compareTo(ma) == 0) {
				break;
			}
		}
		return (i);
	}

	public static void suadoi(String ma) {
		int diem;
		int nam;
		if (tk(ma) < sl) {
			System.out.println("Thông tin tên cần sửa:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập họ tên:");
			String ten = sc.nextLine();
			ht[tk(ma)] = ten;
			System.out.println("Nhập năm sinh:");
			nam = sc.nextInt();
			ns[tk(ma)] = nam;
			System.out.println("Nhập điểm toán:");
			diem = sc.nextInt();
			dv[tk(ma)] = diem;
			System.out.println("Nhập điểm văn:");
			diem = sc.nextInt();
			dt[tk(ma)] = diem;
			System.out.println("Nhập điểm anh:");
			diem = sc.nextInt();
			ta[tk(ma)] = diem;
		}
		if (tk(ma) == sl)
			System.out.println("Không tìm thấy học sinh");
	}
	public static void xoahs(String maxoa) {
		if (tk(maxoa) < sl) {
			for (int i = tk(maxoa); i < sl; i++) {
				mhs[i] = mhs[i + 1];
				ht[i] = ht[i + 1];
				ns[i] = ns[i + 1];
				dv[i] = dv[i + 1];
				dt[i] = dt[i + 1];
				ta[i] = ta[i + 1];
			}
			sl -= 1;
		}
	}
	public static int tk1(String ma) {
		int i;
		for (i = 0; i < sl; i++) {
			if (mhs[i].compareTo(ma) == 0) {
				System.out.printf("%-13s %-18s %-10s  %-8s %-6s %-7s %-6s \n", "Mã học sinh", "Họ và Tên", "Năm sinh",
						"Toán", "Văn", "Anh", "ĐTB");
				System.out.printf("____________|__________________|__________|_______|_______|_______|_______|\n");
				System.out.printf("%-13s %-18s %-10d  %-8d %-8d %-6d %-7.2f \n", mhs[i].toUpperCase(),
						ht[i].toUpperCase(), ns[i], dv[i], dt[i], ta[i], dtb[i]);
			}
		}
		if (tk(ma) == sl)
			System.out.println("Không tìm thấy học sinh");
		return -1;
	}
	
	public static void themhs() {
		int i = sl;

		System.out.println("Nhập mã học sinh thứ " + (i + 1) + ": ");
		mhs[i] = nhapmhs();

		System.out.println("Nhập họ tên học sinh thứ " + (i + 1) + " : ");
		ht[i] = nhapht();
		System.out.println("Nhập năm sinh học sinh thứ " + (i + 1) + ": ");
		ns[i] = nhapns();
		if (ns[i] > 2023) {
			System.out.println("Nhập lại năm sinh");
			ns[i] = nhapns();
		}
		System.out.println("Nhập điểm toán học sinh thứ " + (i + 1) + ": ");
		dv[i] = nhapdiem();
		if (dv[i] > 10) {
			System.out.println("Nhập lại điểm toán");
			dv[i] = nhapns();
		}
		System.out.println("Nhập điểm văn học sinh thứ " + (i + 1) + ": ");
		dt[i] = nhapdiem();
		if (dt[i] > 10) {
			System.out.println("Nhập lại điểm văn");
			dt[i] = nhapns();
		}
		System.out.println("Nhập điểm anh học sinh thứ " + (i + 1) + ": ");
		ta[i] = nhapdiem();
		if (ta[i] > 10) {
			System.out.println("Nhập lại điểm anh");
			ta[i] = nhapns();
		}
		sl += 1;
	}
	public static void ketqua() {
	    kq = new String[sl];
	    for (int i = 0; i < sl; i++) {
	        if (dtb[i] >= 5.0) {
	            kq[i] = "Đậu";
	        } else {
	            kq[i] = "Rớt";
	        }
	    }
	    System.out.println("Kết quả học tập của các học sinh:");
	    System.out.printf("%-13s %-18s %-6s \n", "Mã học sinh", "Họ và Tên", "Kết quả");
	    for (int i = 0; i < sl; i++) {
	        System.out.printf("____________|__________________|________\n");
	        System.out.printf("%-13s %-18s %-6s \n", mhs[i].toUpperCase(), ht[i].toUpperCase(), kq[i]);
	    }
	}
	public static void danhHieu() {
	    String[] danhHieu = new String[sl];
	    for (int i = 0; i < sl; i++) {
	        if (dtb[i] >= 8.0) {
	            danhHieu[i] = "Học sinh giỏi";
	        } else if (dtb[i] >= 6.5) {
	            danhHieu[i] = "Học sinh khá";
	        } else {
	            danhHieu[i] = "Học sinh trung bình";
	        }
	    }
	    System.out.println("Danh hiệu của các học sinh:");
	    System.out.printf("%-13s %-18s %-6s \n", "Mã học sinh", "Họ và Tên", "Danh hiệu");
	    for (int i = 0; i < sl; i++) {
	        System.out.printf("____________|__________________|________\n");
	        System.out.printf("%-13s %-18s %-6s \n", mhs[i].toUpperCase(), ht[i].toUpperCase(), danhHieu[i]);
	    }
	}
	public static void xuatHocSinhRaFile(String file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i <= sl; i++) {
            	writer.write("Mã học sinh: " + mhs[i]);
                writer.newLine();
                writer.write("Họ và Tên: " + ht[i]);
                writer.newLine();
                writer.write("Năm sinh: " + ns[i]);
                writer.newLine();
                writer.write("Điểm Toán: " + dv[i]);
                writer.newLine();
                writer.write("Điểm Văn: " + dt[i]);
                writer.newLine();
                writer.write("Điểm Anh: " + ta[i]);
                writer.newLine();
                writer.write("Điểm trung bình: " + dtb[i]);
                writer.newLine();
                writer.newLine(); 
                System.out.println("Thông tin học sinh đã được xuất ra file" + file + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
