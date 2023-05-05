package com.masai.entities;

import java.util.Date;

public class Bus {
	private String busName;
    private String source;
    private String destination;
    private String busType;
    private Date departureTime;
    private Date arrivalTime;
    private int totalSeats;
    private int[] seatMap;
    
    public Bus(String busName, String source, String destination, String busType,
            Date departureTime, Date arrivalTime, int totalSeats) {
     this.busName = busName;
     this.source = source;
     this.destination = destination;
     this.busType = busType;
     this.departureTime = departureTime;
     this.arrivalTime = arrivalTime;
     this.totalSeats = totalSeats;
     this.seatMap = new int[totalSeats];
 }
	
	

	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int[] getSeatMap() {
        return seatMap;
    }
	



	@Override
	    public String toString() {
	        return 
	                "busName='" + busName + '\'' +
	                ", source='" + source + '\'' +
	                ", destination='" + destination + '\'' +
	                ", busType='" + busType + '\'' +
	                ", departureTime=" + departureTime +
	                ", arrivalTime=" + arrivalTime +
	                ", totalSeats=" + totalSeats 
	                ;
	    }


	
	public void bookSeat(int seatNumber) {
		// TODO Auto-generated method stub
		seatMap[seatNumber - 1] = 1;
	}


}