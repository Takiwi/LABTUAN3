package Bai_1;

import java.util.Scanner;

public class DSHocSinh {
	private HocSinh[] ds;
	private int soLuong;
	Scanner sc = new Scanner(System.in);
	
	public DSHocSinh() {
		this.ds = new HocSinh[0];
	}
	
	public void nhapDS() {
		System.out.print("Nhap so luong hoc sinh: ");
		this.soLuong = sc.nextInt();
		ds = new HocSinh[this.soLuong];
		
		for(int i = 0; i < ds.length; i++) {
			ds[i] = new HocSinh();
			ds[i].nhapHocSinh();
		}
	}
	
	public void inDS() {
		this.sapXepGiamDan();
		
		for(int i = 0; i < ds.length; i++) {
			ds[i].xuatHocSinh();
		}
	}
	
	public void sapXepGiamDan() {
		for(int i = 0; i < ds.length - 1; i++) {
			for(int j = i + 1; j < ds.length; j++) {
				if(ds[i].diemTB < ds[j].diemTB) {
					HocSinh temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
	}
}
