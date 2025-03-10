package Bai_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Tạo đối tượng phần số p1 dùng phương thức khởi tạo mặc định, xuất ra màn hình, quản
//		sát kết quả. Sau đó gọi phương thức nhapPhanSo() cho phần số p1 và xuất kết quả ra
//		màn hình.
		PhanSo p1 = new PhanSo();
		
		p1.xuatPhanSo();
		
		p1.nhapPhanSo();
		p1.xuatPhanSo();
		
//		Tạo đối tượng phần số p2 = 4/16 dùng phương thức khởi tạo có tham số, xuất ra màn
//		hình, quản sát kết quả.
		
		PhanSo p2 = new PhanSo(4, 16);
		
		p2.xuatPhanSo();
		
//		Tạo đối tượng phân số p3 dùng phương thức khởi tạo có tham số, với tham số là giá trị
//		nhập từ bàn phím.
		
		PhanSo p3 = new PhanSo(1, 2);
	
//		Cộng phần số p1 với phần số p3, xuất ra màn hình phần số kết quả.
		
		PhanSo temp = p3.cong(p1);
		temp.xuatPhanSo();
		
//		Tạo đối tượng phần số p4 dùng phương thức khởi tạo sao chép từ phần số kết quả tính
//		được ở trên.
		
		PhanSo p4 = new PhanSo(temp);
		
//		Nhân p4 với p2, xuất ra màn hình phần số kết quả.
		PhanSo temp2 = p4.nhan(p2);
		temp2.xuatPhanSo();
	}

}
