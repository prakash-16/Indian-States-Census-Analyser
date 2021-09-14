package com.bridgelabz.indianstatescensusanalyser.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class StateCensusCodeAnalyser {

	public int i = 0;
	ArrayList<IndianStateCensus> census = new ArrayList<IndianStateCensus>();

	public int loadDataFromCensus(String filePath) throws IOException, StateCensusDataException {
		try {
			i = 0;
			CSVReader reader = new CSVReader(new FileReader(filePath));
			List<String[]> data = reader.readAll();
			data.stream().forEach(n -> {
				Iterator<String> iter = Arrays.stream(n).iterator();
				String state = iter.next();
				String population = iter.next();
				String area = iter.next();
				String density = iter.next();
				if (i == 0) {
					i++;
				} else {
					census.add(new IndianStateCensus(state, Long.parseLong(population), Long.parseLong(area),
							Long.parseLong(density)));
				}
			});
			reader.close();
		} catch (FileNotFoundException x) {
			throw new StateCensusDataException(x.getMessage(), ExceptionType.File_Not_Found);
		} catch (IllegalStateException x) {
			throw new StateCensusDataException(x.getMessage(), ExceptionType.Parse_Conversion_Error);
		}
		return census.size();
	}
}
