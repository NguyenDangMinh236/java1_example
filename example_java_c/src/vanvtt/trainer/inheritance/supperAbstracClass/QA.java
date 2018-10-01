package vanvtt.trainer.inheritance.supperAbstracClass;

public class QA extends ANhanVien {
	private boolean isTestAutomation;

	public QA(boolean isTestAutomation, String ten, String maNV) {
		super(ten, maNV);
		this.isTestAutomation = isTestAutomation;
	}

	// Sẽ báo lỗi
	// public QA(boolean isTestAutomation, String ten, String maNV) {
	// this.ten = ten;
	// this.maNV = maNV;
	// this.isTestAutomation = isTestAutomation;
	// }

	public boolean isTestAutomation() {
		return isTestAutomation;
	}

	public void setTestAutomation(boolean isTestAutomation) {
		this.isTestAutomation = isTestAutomation;
	}

	@Override
	public String boPhan() {
		return "Kiểm thử";
	}

}
