package vanvtt.trainer.inheritance.supperAbstracClass;

public abstract class ANhanVien {
	protected String ten;
	protected String maNV;

	public ANhanVien(String ten, String maNV) {
		this.ten = ten;
		this.maNV = maNV;
	}

	public abstract String boPhan();

	public void xuatThongTin() {
		System.out.println("===== Nhân viên =====");
		System.out.println("- Mã nhân viên: " + maNV);
		System.out.println("- Tên: " + ten);
		System.out.println("- Loại nhân viên: " + boPhan());
	}
}
