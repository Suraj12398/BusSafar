package com.masai.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;



public class Bookings implements Serializable{
		private  String userName;
		private String busName;
	    private String destination;
	    private int numSeats;
	    private Date departureTime;
	    private String id;

	    public Bookings(String userName, String busName,String destination, int numSeats, Date departureTime) {
	        this.userName = userName;
	        this.busName = busName;
	        this.numSeats = numSeats;
	        this.departureTime = departureTime;
	        this.id =UUID.randomUUID().toString().substring(0, 6).toUpperCase();
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
		public String getId() {
	        return id;
	    }
		public String toString() {
	        return "Booking{" +
	        		
	                "Id='" + id + '\'' +
	                ", Username=' " + userName + '\'' +
	                ", busname=' " + busName + '\'' +
	                ", Seat No.= " + numSeats +
	                ", Departure Time= " + departureTime +
	                '}';
}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

}