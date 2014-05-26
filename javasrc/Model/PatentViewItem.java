package demp.soft.Model;

public class PatentViewItem {
	private String View;
	private String PId;
	private String FileName;
	private String FingerPrint;

	public String getView() {
		return View;
	}

	public void setView(String view) {
		View = view;
	}

	public String getPId() {
		return PId;
	}

	public void setPId(String pId) {
		PId = pId;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		this.FileName = fileName;
	}

	public String getFingerPrint() {
		return FingerPrint;
	}

	public void setFingerPrint(String fingerPrint) {
		FingerPrint = fingerPrint;
	}

}
