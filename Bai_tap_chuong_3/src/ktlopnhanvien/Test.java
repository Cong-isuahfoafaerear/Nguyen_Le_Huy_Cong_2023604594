package ktlopnhanvien;



public class Test {
	public static void main(String[] args) {
		DiaChi dc = new DiaChi("dan sinh", "thieu chinh", "thiue hoa", "thanh hoa");
		NhanVien nv = new NhanVien("cong", dc, "24-1-2005", 'M');
		System.out.println(nv);
	}
}
