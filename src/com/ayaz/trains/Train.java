package com.ayaz.trains;

public class Train {
	private int trainNo;
	private String trainName;
	private String start;
	private String end;
	private String date;
	private int seats;
	private int cost;
	public Train(int trainNo, String trainName, String start, String end, String date, int seats,int cost) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.start = start;
		this.end = end;
		this.date = date;
		this.seats = seats;
		this.cost = cost;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public String getStart() {
		return start;
	}
	public String getEnd() {
		return end;
	}
	public String getDate() {
		return date;
	}
	public int getSeats() {
		return seats;
	}
	public int getCost() {
		return cost;
	}
	public void setSeats(int val)
	{
		this.seats=val;
	}
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", start=" + start + ", end=" + end
				+ ", date=" + date + ", seats=" + seats + "]";
	}
	
}
