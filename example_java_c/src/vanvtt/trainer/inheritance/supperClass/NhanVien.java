package vanvtt.trainer.inheritance.supperClass;

public class NhanVien {
	protected String ten;
	protected String maNV;

	public NhanVien() {
	}

	public NhanVien(String ten, String maNV) {
		this.ten = ten;
		this.maNV = maNV;
	}

	protected String boPhan() {
		// Lớp con phải override để biết là nhân viên dev, BO hay QA
		return "";
	}

	public void xuatThongTin() {
		System.out.println("===== Nhân viên =====");
		System.out.println("- Mã nhân viên: " + maNV);
		System.out.println("- Tên: " + ten);
		System.out.println("- Loại nhân viên: " + boPhan());
	}
}
