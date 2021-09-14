package com.bridgelabz.indianstatescensusanalyser.main;

public class IndianStateCensus {

	String state;
	long population;
	long area;
	long density;

	public IndianStateCensus(String state, long population, long area, long density) {
		this.state = state;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	@Override
	public String toString() {
		return "State - " + state + " | Population - " + population + " | AreaInSqKm - " + area + " | DesityPerSqKm - "
				+ density;
	}

}
