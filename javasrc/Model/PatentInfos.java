package demp.soft.Model;

public class PatentInfos {
	private String PId;
	private String Describe;
	private float Similarity;

	public String getPId() {
		return PId;
	}

	public void setPId(String pId) {
		PId = pId;
	}

	public String getDescribe() {
		return Describe;
	}

	public void setDescribe(String describe) {
		Describe = describe;
	}

	public float getSimilarity() {
		return Similarity;
	}

	public void setSimilarity(float similarity) {
		Similarity = similarity;
	}
}
