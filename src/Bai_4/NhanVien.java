package Bai_4;

public class NhanVien {
	private String id, hoTen;
	double luongCoBan, heSoLuong, soLuongNV;
	
	public NhanVien() {
		this.id = this.hoTen = "";
		this.luongCoBan = this.heSoLuong = this.soLuongNV = 0;
	}
	
	public NhanVien(String id, String hoTen, double luongCoBan, double heSoLuong, double soLuongNV) {
		this.id = id;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soLuongNV = soLuongNV;
	}
	
	
}
