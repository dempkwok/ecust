package demp.soft.Model;


public class PatentInfo{
	private String PId;	
	private String FingerPrint;
	private float Distance;

	public float getDistance() {
		return Distance;
	}

	public void setDistance(float d) {
		Distance = d;
	}

	public String getPId() {
		return PId;
	}

	public void setPId(String pId) {
		PId = pId;
	}

	public String getFingerPrint() {
		return FingerPrint;
	}

	public void setFingerPrint(String fingerPrint) {
		FingerPrint = fingerPrint;
	}

}
