package vanvtt.trainer.inheritance.supperAbstracClass;

public class Dev extends ANhanVien {
	private String ngonNgu;

	public Dev(String ten, String maNV, String ngonNgu) {
		super(ten, maNV);
		this.ngonNgu = ngonNgu;
	}

	// public Dev(String ten, String maNV, String ngonNgu) {
	// this.ten = ten;
	// this.maNV = maNV;
	// this.ngonNgu = ngonNgu;
	// }

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}
	
	@Override
	public String boPhan() {
		return "Phát triển";
	}
}
