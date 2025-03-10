package Bai_1;

import java.util.Scanner;

public class HocSinh {
	int maSo;
	String hoTen;
	double diemTB;
	Scanner sc = new Scanner(System.in);
	
	public HocSinh() {
		this.diemTB = this.maSo = 0;
		this.hoTen = "";
	}
	
	public HocSinh(int maSo, String hoTen, double diemTB) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	public HocSinh(HocSinh other) {
		this.maSo = other.maSo;
		this.hoTen = other.hoTen;
		this.diemTB = other.diemTB;
	}
	
	public int getMaSo() {
		return this.maSo;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public double getDiemTB() {
		return this.diemTB;
	}
	
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public void nhapHocSinh() {
		System.out.print("Nhap ma so: ");
		this.maSo = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Nhap diem trung binh: ");
		this.diemTB = sc.nextDouble();
	}
	
	public void xuatHocSinh() {
		System.out.println("-----------------------");
		System.out.println("Ma so: " + this.maSo);
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Diem trung binh: " + this.diemTB);
	}
}
