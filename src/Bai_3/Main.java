package Bai_3;

public class Main {

	public static void main(String[] args) {
//		Phương thức khởi tạo không tham số: khởi tạo với hai giá trị x = 0, y = 0
		
		Point2D p1 = new Point2D();
//		Phương thức in tọa độ của một điểm.
		p1.inDiem();
		
//		Phương thức khởi tạo có tham số
		Point2D p2 = new Point2D(1, 2);
		p2.inDiem();
		
		Point2D p3 = new Point2D(2, 4);
		
//		Phương thức tính tổng các thành phần x và y của hai điểm
		Point2D kq = p2.congDiem(p3);
		kq.inDiem();
		
//		Phương thức tính điểm đối xứng qua trục hoành của một điểm
		kq.diemDoiXung();
	}

}
