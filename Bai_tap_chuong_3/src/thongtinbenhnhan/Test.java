package thongtinbenhnhan;




public class Test {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("chi", "thanh hoa", "ten");
		BenhNhan bn = new BenhNhan("cong", 20, 'M', "viem hong", "cum", bv);
		System.out.println("thong tin benh nhan: "+bn);
}
}