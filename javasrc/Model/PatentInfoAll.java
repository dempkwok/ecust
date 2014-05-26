package demp.soft.Model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class PatentInfoAll {
	private String PId;

	private String TopView;
	private String BottomView;
	private String LeftView;
	private String RightView;
	private String FrontView;
	private String BehindView;

	protected String PName;
	protected String PDescribe;
	protected String ApplyId;
	protected Date ApplyDate;
	protected String Applicant;
	protected String Applicants;
	protected String Inventor;
	protected String OpenId;
	protected Date OpenDate;
	protected Date CertificationDate;

	protected String CSId;
	protected String CFId;

	public String getPName() {
		return ("" + PName).equals("") ? "default" : PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public String getPDescribe() {
		return ("" + PDescribe).equals("") ? "default" : PDescribe;
	}

	public void setPDescribe(String pDescribe) {
		PDescribe = pDescribe;
	}

	public String getApplyId() {
		return ("" + ApplyId).equals("") ? "0" : ApplyId;
	}

	public void setApplyId(String applyId) {
		ApplyId = applyId;
	}

	public String getApplyDate() {
		return ApplyDate.toString().equals("1991-01-01") ? "1991-01-01"
				: ApplyDate.toString();
	}

	public void setApplyDate(String applyDate) {
		if (applyDate.equals("") || !applyDate.contains("-"))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			ApplyDate = new Date((sdf.parse(applyDate)).getTime());
		} catch (ParseException e) {
			System.out.println("ApplyDate");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplicant() {
		return ("" + Applicant).equals("") ? "default" : Applicant;

	}

	public void setApplicant(String applicant) {
		Applicant = applicant;
	}

	public String getApplicants() {
		return ("" + Applicants).equals("") ? "default" : Applicants;

	}

	public void setApplicants(String applicants) {
		Applicants = applicants;
	}

	public String getInventor() {
		return ("" + Inventor).equals("") ? "default" : Inventor;
	}

	public void setInventor(String inventor) {
		Inventor = inventor;
	}

	public String getOpenId() {
		return ("" + OpenId).equals("") ? "0" : OpenId;
	}

	public void setOpenId(String openId) {
		OpenId = openId;
	}

	public String getOpenDate() {
		return OpenDate.toString().equals("1991-01-01") ? "1991-01-01"
				: OpenDate.toString();
	}

	public void setOpenDate(String openDate) {
		if (openDate.equals("") || !openDate.contains("-"))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			OpenDate = new Date((sdf.parse(openDate)).getTime());
		} catch (ParseException e) {
			System.out.println("OpenDate");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getCertificationDate() {
		return CertificationDate.toString().equals("1991-01-01") ? "1991-01-01"
				: CertificationDate.toString();
	}

	public void setCertificationDate(String certificationDate) {
		if (certificationDate.equals("") || !certificationDate.contains("-"))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			CertificationDate = new Date(
					(sdf.parse(certificationDate)).getTime());
		} catch (ParseException e) {
			System.out.println("CertificationDate");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getCSId() {
		return ("" + CSId).equals("") ? "0" : CSId;
	}

	public void setCSId(String cSId) {
		CSId = cSId;
	}

	public String getCFId() {
		return ("" + CFId).equals("") ? "0" : CFId;
	}

	public void setCFId(String cFId) {
		CFId = cFId;
	}

	public String getPId() {
		return ("" + PId).equals("") ? "0" : PId;
	}

	public void setPId(String pId) {
		PId = pId;
	}

	public String getTopView() {
		return TopView;
	}

	public void setTopView(String topView) {
		TopView = topView;
	}

	public void setWhichIsEmpty(String view) {
		if (TopView == null)
			TopView = view;
		else if (BottomView == null)
			BottomView = view;
		else if (FrontView == null)
			FrontView = view;
		else if (BehindView == null)
			BehindView = view;
		else if (RightView == null)
			RightView = view;
		else if (LeftView == null)
			LeftView = view;
	}

	public String getBottomView() {
		return BottomView;
	}

	public void setBottomView(String bottomView) {
		BottomView = bottomView;
	}

	public String getLeftView() {
		return LeftView;
	}

	public void setLeftView(String leftView) {
		LeftView = leftView;
	}

	public String getRightView() {
		return RightView;
	}

	public void setRightView(String rightView) {
		RightView = rightView;
	}

	public String getFrontView() {
		return FrontView;
	}

	public void setFrontView(String frontView) {
		FrontView = frontView;
	}

	public String getBehindView() {
		return BehindView;
	}

	public void setBehindView(String behindView) {
		BehindView = behindView;
	}

	public PatentInfoAll() {
		this.PId = "0";
		this.setApplyDate("1991-01-01");
		this.setOpenDate("1991-01-01");
		this.setCertificationDate("1991-01-01");
		this.setPName("0");
		this.setPDescribe("0");
		this.setApplyId("0");
		this.setApplicant("0");
		this.setApplicants("0");
		this.setInventor("0");
		this.setOpenId("0");
		this.setCFId("1");
		this.setCSId("1");
	}

}
