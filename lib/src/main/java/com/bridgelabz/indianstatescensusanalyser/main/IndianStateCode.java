package com.bridgelabz.indianstatescensusanalyser.main;

public class IndianStateCode {
	
	int srNo;
	String stateName;
	int TIN;
	String stateCode;
	
	public IndianStateCode(int srNo, String stateName, int TIN, String stateCode) {
		this.srNo = srNo;
		this.stateName = stateName;
		this.TIN = TIN;
		this.stateCode = stateCode;
	}
	
	@Override
	public String toString() {
		return "SrNo - " + srNo + " | State name - " + stateName + " | TIN - " + TIN + " | StateCode - "
				+ stateCode;
	}

}
