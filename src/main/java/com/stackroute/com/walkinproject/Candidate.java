package com.stackroute.com.walkinproject;

public class Candidate extends CandidateDetails {
	public String newCandidate(String name, String DOB, String role, long mobile, int relevantExp, int totalExp,
			int ref) {
		int Id = 0;
		if (role.equals("Sr. Java Developer") || role.equals("Sr. .Net Developer") || role.equals("Java Architect")) {
			if (totalExp >= 60 && relevantExp >= 60 && ref >= 2) {
				CandidateDetails candidateDetails = new CandidateDetails(name, mobile, DOB, role, relevantExp, totalExp,
						ref);
				Id = getParticipantId();
				System.out.println(candidateDetails.getName() + ", your details were submitted successfully "
						+ "and your participantId is " + Id + "\n");
				return "Applicable";
			} else {
				System.out.println(name + " Not Applicable\n");
			}
		}
		if (role.equals("Java Developer") || role.equals(".Net Developer")) {
			if (totalExp >= 24 && relevantExp >= 24) {
				CandidateDetails candidateDetails = new CandidateDetails(name, mobile, DOB, role, relevantExp,
						totalExp);
				Id = getParticipantId();
				System.out.println(candidateDetails.getName() + ", your details were submitted successfully "
						+ "and your participantId is " + Id + "\n");
				return "Applicable";
			} else {
				System.out.println(name + " Not Applicable\n");
			}
		}
		if (role.equals("Training Support")) {
			if (totalExp >= 12 && relevantExp >= 12) {
				CandidateDetails candidateDetails = new CandidateDetails(name, mobile, DOB, role, relevantExp,
						totalExp);
				Id = getParticipantId();
				System.out.println(candidateDetails.getName() + ", your details were submitted successfully "
						+ "and your participantId is " + Id + "\n");
				return "Applicable";
			} else {
				System.out.println(name + " Not Applicable\n");
			}
		}
		return "Not Applicable";
	}
}
