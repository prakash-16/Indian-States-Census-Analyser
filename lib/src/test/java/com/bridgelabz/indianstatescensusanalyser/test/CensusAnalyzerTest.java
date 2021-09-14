package com.bridgelabz.indianstatescensusanalyser.test;

import java.io.IOException;

import org.junit.Test;

import com.bridgelabz.indianstatescensusanalyser.main.StateCensusCodeAnalyser;
import com.bridgelabz.indianstatescensusanalyser.main.StateCensusDataException;

import org.junit.Assert;

public class CensusAnalyzerTest {
	
	public String India_State_Census_Data = "C:\\Users\\pgoud\\eclipse-workspace\\Indian-States-Census-Analyser\\lib\\src\\test\\resources\\IndiaStateCensusData.csv";

	@Test
	public void checkSizeOfIndiaStateCensusData() throws Exception {
		try {
			StateCensusCodeAnalyser censusDataSize = new StateCensusCodeAnalyser();
			int size = censusDataSize.loadDataFromCensus(India_State_Census_Data);
			Assert.assertEquals(29, size);
		} catch (StateCensusDataException x) {
			x.printStackTrace();
		}
	}
	
	@Test
	public void IfFileIncorrectReturnCustomException() throws Exception {
		try {
			StateCensusCodeAnalyser censusDataSize = new StateCensusCodeAnalyser();
			int size = censusDataSize.loadDataFromCensus(India_State_Census_Data);
			Assert.assertEquals(29, size);
		} catch (StateCensusDataException x) {
			x.printStackTrace();
		}
	}
	
	@Test
	public void IfFileTypeIsIncorrectReturnCustomException() throws Exception {
		try {
			StateCensusCodeAnalyser censusDataSize = new StateCensusCodeAnalyser();
			int size = censusDataSize.loadDataFromCensus(India_State_Census_Data);
			Assert.assertEquals(29, size);
		} catch (StateCensusDataException x) {
			x.printStackTrace();
		}
	}
	
	@Test
	public void IfIncorrectDelimiterReturnCustomException() throws Exception {
		try {
			StateCensusCodeAnalyser censusDataSize = new StateCensusCodeAnalyser();
			int size = censusDataSize.loadDataFromCensus(India_State_Census_Data);
			Assert.assertEquals(29, size);
		} catch (StateCensusDataException x) {
			x.printStackTrace();
		}
	}
	
	@Test
	public void IfIncorrectCSVHeaderReturnCustomException() throws Exception {
		try {
			StateCensusCodeAnalyser censusDataSize = new StateCensusCodeAnalyser();
			int size = censusDataSize.loadDataFromCensus(India_State_Census_Data);
			Assert.assertEquals(29, size);
		} catch (StateCensusDataException x) {
			x.printStackTrace();
		}
	}

}
