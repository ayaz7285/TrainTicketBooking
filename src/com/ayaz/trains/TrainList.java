package com.ayaz.trains;
import java.util.ArrayList;
import java.util.List;

public class TrainList {
	private static List<Train> trainDB = new ArrayList<Train>();

	public static List<Train> getTrainDB() {
		return trainDB;
	}
}
