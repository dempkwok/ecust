package demp.soft.Model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SearchInfo {
	private Date OpenDateBefore;
	private Date ApplyDateBefore;
	private Date OpenDateAfter;
	private Date ApplyDateAfter;
	private Date CertificationDate;
	private String PId;
	private String PName;
	private String PDescribe;
	private String ApplyId;
	private String Applicant;
	private String Applicants;
	private String Inventor;
	private String OpenId;
	private String CSId;
	private String CFId;
	

	public String getPId() {
		return PId;
	}

	public void setPId(String pId) {
		PId = pId;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public String getPDescribe() {
		return PDescribe;
	}

	public void setPDescribe(String pDescribe) {
		PDescribe = pDescribe;
	}

	public String getApplyId() {
		return ApplyId;
	}

	public void setApplyId(String applyId) {
		ApplyId = applyId;
	}

	public String getApplicant() {
		return Applicant;
	}

	public void setApplicant(String applicant) {
		Applicant = applicant;
	}

	public String getApplicants() {
		return Applicants;
	}

	public void setApplicants(String applicants) {
		Applicants = applicants;
	}

	public String getInventor() {
		return Inventor;
	}

	public void setInventor(String inventor) {
		Inventor = inventor;
	}

	public String getOpenId() {
		return OpenId;
	}

	public void setOpenId(String openId) {
		OpenId = openId;
	}

	public String getCSId() {
		return CSId;
	}

	public void setCSId(String cSId) {
		CSId = cSId;
	}

	public String getCFId() {
		return CFId;
	}

	public void setCFId(String cFId) {
		CFId = cFId;
	}

	public void setOpenDateBefore(Date openDateBefore) {
		OpenDateBefore = openDateBefore;
	}

	public void setApplyDateBefore(Date applyDateBefore) {
		ApplyDateBefore = applyDateBefore;
	}

	public void setOpenDateAfter(Date openDateAfter) {
		OpenDateAfter = openDateAfter;
	}

	public void setApplyDateAfter(Date applyDateAfter) {
		ApplyDateAfter = applyDateAfter;
	}

	public String getOpenDateBefore() {
		return OpenDateBefore.toString();
	}

	public void setOpenDateBefore(String openDateBefore) {
		if (openDateBefore.equals(""))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			OpenDateBefore = new Date((sdf.parse(openDateBefore)).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplyDateBefore() {
		return ApplyDateBefore.toString();
	}

	public void setApplyDateBefore(String applyDateBefore) {
		if (applyDateBefore.equals(""))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			ApplyDateBefore = new Date((sdf.parse(applyDateBefore)).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getOpenDateAfter() {
		return OpenDateAfter.toString();
	}

	public void setOpenDateAfter(String openDateAfter) {
		if (openDateAfter.equals(""))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			OpenDateAfter = new Date((sdf.parse(openDateAfter)).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplyDateAfter() {
		return ApplyDateAfter.toString();
	}

	public void setApplyDateAfter(String applyDateAfter) {
		if (applyDateAfter.equals(""))
			return;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			ApplyDateAfter = new Date((sdf.parse(applyDateAfter)).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SearchInfo() {
		this.setOpenDateAfter("1991-01-01");
		this.setOpenDateBefore("1991-01-01");
		this.setApplyDateAfter("1991-01-01");
		this.setApplyDateBefore("1991-01-01");
		//this.setApplyDate("1991-01-01");
	}

}
