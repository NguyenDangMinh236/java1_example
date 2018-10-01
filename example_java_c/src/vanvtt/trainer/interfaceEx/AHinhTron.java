package vanvtt.trainer.interfaceEx;

public abstract class AHinhTron implements HinhHoc {

	protected String ten;
	protected float banKinh;

	// Constructor
	public AHinhTron(float banKinh) {
		this.ten = "Hình Tròn Abstract";
		this.banKinh = banKinh;
	}

	@Override
	public float tinhChuVi() {
		return 2 * PI * banKinh;
	}

	@Override
	public float tinhDienTich() {
		return PI * banKinh * banKinh;
	}

	/**
	 * Có thể lượt bỏ code này Vì system sẽ hiểu rẳng class con của abstract
	 * class AHinhTron sẽ phải implement method này rồi
	 */
	// @Override
	// public abstract float tinhTheTich();

	@Override
	public void xuatThongTin() {
		System.out.println(ten);
		System.out.println("Chu vi: " + tinhChuVi());
		System.out.println("Diện tích: " + tinhDienTich());
	}

}
