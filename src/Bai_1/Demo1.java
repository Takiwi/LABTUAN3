package Bai_1;

public class Demo1 {

	public static void main(String[] args) {
//		Khởi tạo đề tạo ra ba đối tượng học sinh bằng ba cách khác nhau.
		
		HocSinh hs1 = new HocSinh();
		HocSinh hs2 = new HocSinh(1, "Hoang Dinh Tan", 3);
		HocSinh hs3 = new HocSinh(hs2);
		
//		Với các tạo đối tượng học sinh bằng phương thức khởi tạo không có tham số, hãy
//		gọi phương thức nhập để nhập thông tin học sinh hoặc lớp học sinh.
		
		hs1.nhapHocSinh();
		
//		Thực hiện đổi tên của học sinh thành một tên mới.
		
		hs2.xuatHocSinh();
		hs2.setHoTen("Nguyen Van A");
		hs2.xuatHocSinh();
		
//		Tìm tên của học sinh có điểm trung bình lớn nhất.
		double max = hs1.getDiemTB();
		String ten = hs1.getHoTen();
		if(max < hs2.getDiemTB()) {
			max = hs2.getDiemTB();
			ten = hs2.getHoTen();
		}
		
		if(max < hs3.getDiemTB()) {
			max = hs3.getDiemTB();
			ten = hs3.getHoTen();
		}
		
		System.out.println("Hoc sinh " + ten + " co diem trung binh cao nhat la: " + max);
	}

}
