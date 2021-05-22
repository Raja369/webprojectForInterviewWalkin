package com.stackroute.com.walkinproject;

public class CandidateDetails {
	private String name;
	private long mobileNumber;
	private String roleApply;
	private String birthDate;
	private int references;
	private int relevantExp;
	private int totalExp;
	public static int participantId = 0;

	public CandidateDetails(String name, long mobileNumber, String birthDate, String roleApply, int relevantExp,
			int totalExp, int references) {
		setName(name);
		setMobileNumber(mobileNumber);
		setBirthDate(birthDate);
		setRoleApply(roleApply);
		setRelevantExp(relevantExp);
		setReferences(references);
	}

	public CandidateDetails(String name, long mobileNumber, String birthDate, String roleApply, int relevantExp,
			int totalExp) {
		setName(name);
		setMobileNumber(mobileNumber);
		setBirthDate(birthDate);
		setRoleApply(roleApply);
		setRelevantExp(relevantExp);
	}

	public CandidateDetails() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRoleApply() {
		return roleApply;
	}

	public void setRoleApply(String roleApply) {
		this.roleApply = roleApply;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getRelevantExp() {
		return relevantExp;
	}

	public void setRelevantExp(int relevantExp) {
		this.relevantExp = relevantExp;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}

	public int getReferences() {
		return references;
	}

	public void setReferences(int references) {
		this.references = references;
	}

	public int getParticipantId() {
		participantId = participantId + 1;
		return participantId;
	}
}