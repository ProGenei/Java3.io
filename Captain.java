
package assignment_3_uberapp;

import java.util.Date;

public class Captain extends Employee {
    private int drivingLicenseNo;
    private int totalRides;
    private double rating;

    public Captain(int drivingLicenseNo, int totalRides, double rating, int empid, String empDesc, boolean onLeave, int id, String name, String email, Date dateOfBirth, char gender, int phone, String address) {
        super(empid, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
        this.drivingLicenseNo = drivingLicenseNo;
        this.totalRides = totalRides;
        this.rating = rating;
    }

    /*Captain(int drivingLicenseNo, int totalRides, double rating, int empid, String empDesc, boolean onLeave, int id, String name, String email, int dateOfBirth, String gender, int phone, String address) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public int getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public double getRating() {
        return rating;
    }

    public void setDrivingLicenseNo(int drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Captain{" + "drivingLicenseNo=" + drivingLicenseNo + ", totalRides=" + totalRides + ", rating=" + rating + '}';
    }
    
}
