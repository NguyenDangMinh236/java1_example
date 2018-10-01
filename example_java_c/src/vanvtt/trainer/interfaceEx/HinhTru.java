package vanvtt.trainer.interfaceEx;

public class HinhTru extends AHinhTron {

	protected float chieuCao;
	protected float theTich;

	public HinhTru(float banKinh, float chieuCao) {
		super(banKinh);
		this.ten = "Hình Trụ";
		this.chieuCao = chieuCao;
	}

	@Override
	public float tinhTheTich() {
		return tinhDienTich() * chieuCao;
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Thể tích: " + tinhTheTich());
	}

}
