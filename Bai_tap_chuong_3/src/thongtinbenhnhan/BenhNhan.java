package thongtinbenhnhan;



public class BenhNhan {
	private String tieuSu;
    private String chanDoan;
    private BenhVien benhVien;
    
    public BenhNhan() {
  	  super();
    }

	public BenhNhan(String ten,int tuoi, char gioiTinh, String tieuSu, String chanDoan, BenhVien benhVien) {
		super(ten,tuoi,gioiTinh);
		this.tieuSu = tieuSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}
    
    
   public String getTieuSu() {
		return tieuSu;
	}

	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	@Override
	public String toString() {
		return super.toString() + "BenhNhan [tieuSu=" + tieuSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
	} 
    
}
