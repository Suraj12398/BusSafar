package com.masai.entities;

import java.util.Date;

public class Bookings {
	 private String userName;
	    private String busName;
	    private int numSeats;
	    private Date departureTime;

	    public Bookings(String userName, String busName, int numSeats, Date departureTime) {
	        this.userName = userName;
	        this.busName = busName;
	        this.numSeats = numSeats;
	        this.departureTime = departureTime;
	    }

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getBusName() {
			return busName;
		}

		public void setBusName(String busName) {
			this.busName = busName;
		}

		public int getNumSeats() {
			return numSeats;
		}

		public void setNumSeats(int numSeats) {
			this.numSeats = numSeats;
		}

		public Date getDepartureTime() {
			return departureTime;
		}

		public void setDepartureTime(Date departureTime) {
			this.departureTime = departureTime;
		}
	    
		public String toString() {
	        return "Booking{" +
	                "userName='" + userName + '\'' +
	                ", busName='" + busName + '\'' +
	                ", numSeats=" + numSeats +
	                ", departureTime=" + departureTime +
	                '}';
}

}
