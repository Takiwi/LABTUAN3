package Bai_2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;
	Scanner sc = new Scanner(System.in);
	
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	public PhanSo(PhanSo other) {
		this.tu = other.tu;
		this.mau = other.mau;
	}
	
	public void nhapPhanSo() {
		System.out.print("Nhap tu so: ");
		this.tu = sc.nextInt();
		System.out.print("Nhap mau so: ");
		this.mau = sc.nextInt();
	}
	
	public void xuatPhanSo() {
		this.rutGon();
		
		if(this.tu % this.mau == 0) {
			System.out.println(this.tu / this.mau);
			
		}else {
			System.out.println(this.tu + "/" + this.mau);
		}
	}
	
	private int USCLN() {
		int a = this.tu;
		int b = this.mau;
		
		if(a == 0 || b == 0) {
			return a + b;
		}
		// 30 16 
		int min = a < b? a : b;
		for(int i = min; i >= 1; i--) {
			if(a % i == 0 || b % i == 0) {
				return i;
			}
		}
		
		return 1;
	}
	
	private void rutGon() {
		int UCLN = USCLN();
		
		this.tu /= UCLN;
		this.mau /= UCLN;
	}
	
	public PhanSo cong(PhanSo p) {
		int mauSo = this.mau * p.mau;
		int tuSo = (this.tu * (mauSo / this.mau)) + (p.tu * (mauSo / p.mau));
		
		return new PhanSo(tuSo, mauSo);
	}
	
	public PhanSo tru(PhanSo p) {
		int tuSo = (this.tu * (mau / this.mau) - p.tu * (mau / p.mau));
		int mauSo = this.mau * p.mau;
		
		return new PhanSo(tuSo, mauSo);
	}
	
	public PhanSo nhan(PhanSo p) {
		int tuSo = this.tu * p.tu;
		int mauSo = this.mau * p.mau;
		
		return new PhanSo(tuSo, mauSo);
	}
	
	public PhanSo chia(PhanSo p) {
		int tuSo = this.tu * p.mau;
		int mauSo = this.mau * p.tu;
		
		return new PhanSo(tuSo, mauSo);
	}
}
