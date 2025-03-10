package Bai_5;

public class TamGiac {
	private float canh1, canh2, canh3;
	
	public TamGiac() {
		this.canh1 = this.canh2 = this.canh3 = 0;
	}
	
	public TamGiac(float canh1, float canh2, float canh3) {
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
	}
	
	public float chuVi() {
		return canh1 + canh2 + canh3;
	}
	
	public double dienTich() {
		float p = this.chuVi() / 2;
		
		return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
	}
	
	public String loai() {
		if((canh1 + canh2 <= canh3) || (canh1 + canh3 <= canh2) || (canh3 + canh2 <= canh1)) {
			return "Khong phai la tam giac";
		}
		
		if(canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
			return "Tam giac can";
		}
		
		if(canh1 == canh2 && canh1 == canh3 && canh2 == canh3) {
			return "Tam giac deu";
		}
		
		double a = Math.pow(canh1, 2);
		double b = Math.pow(canh2, 2);
		double c = Math.pow(canh3, 2);
		
		if((a + b == c) || (a + c == b) || (b + c == a)) {
			return "Tam giac vuong";
		}
		
		return "Tam giac thuong";
	}
	
	@Override 
	public String toString() {
		return this.loai() + "\nChu vi: " + this.chuVi() + "\nDien tich: " + this.dienTich() + "\n";
	}
}
