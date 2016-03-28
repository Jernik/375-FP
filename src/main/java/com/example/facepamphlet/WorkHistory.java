package com.example.facepamphlet;

public class WorkHistory {

	public WorkHistory(String name, String startDate, String endDate) {
		this.historyName = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	private String historyName;
	private String startDate;
	private String endDate;
	
	public String getHistoryName() {
		return historyName;
	}
	public void setHistoryName(String historyName) {
		this.historyName = historyName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
