
package assignment_3_uberapp;

public class Ride {
    private int rideID;
    private String rideType;
    private int noOfSeats;
    private String registrationNo;

    public Ride(int rideID, String rideType, int noOfSeats, String registrationNo) {
        this.rideID = rideID;
        this.rideType = rideType;
        this.noOfSeats = noOfSeats;
        this.registrationNo = registrationNo;
    }

    public int getRideID() {
        return rideID;
    }

    public String getRideType() {
        return rideType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    @Override
    public String toString() {
        return "Ride{" + "rideID=" + rideID + ", rideType=" + rideType + ", noOfSeats=" + noOfSeats + ", registrationNo=" + registrationNo + '}';
    }
    
}

