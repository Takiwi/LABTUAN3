package Bai_3;

public class Point2D {
	private float x = 0.0f;
	private float y = 0.0f;
	
	public Point2D() {
		this.x = this.y = 0;
	}
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void inDiem() {
		System.out.println("(" + this.x + " , " + this.y + ")");
	}
	
	public Point2D congDiem(Point2D other) {
		return new Point2D(other.x + this.x, other.y + y);
	}
	
	public void diemDoiXung() {
		System.out.println("Diem doi xung la: ");
		Point2D temp = new Point2D(this.x, this.y * -1);
		temp.inDiem();
	}
}
