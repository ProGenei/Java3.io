
package assignment_3_uberapp;

import java.util.Date;

public class Rider extends Account {
    private double walletBalance;
    private String pickupForm;
    private String dropTo;
    private double distance;
    private Captain captain;
    private UberAdmin uberAdmin;
    private Payment payment;
    private RiderBonus riderBonus;
    private Ride ride;
    private Date joinSate;
    private double rating;
    private int nosOfPayment;
    private int nosOfBonus;


    
    //public Rider(double walletBalance, String pickupForm, String dropTo, double distance, Captain captain, UberAdmin uberAdmin, Payment[] payment, RiderBonus[] riderBonus, Ride ride, Date joinSate, double rating, int id, String name, String email, Date dateOfBirth, char gender, int phone, String address) {

    public Rider(double walletBalance, String pickupForm, String dropTo, double distance, Date joinSate, double rating, int id, String name, String email, Date dateOfBirth, char gender, int phone, String address, int nosOfPayment, int nosOfBonus) {
        super(id, name, email, dateOfBirth, gender, phone, address);
        this.walletBalance = walletBalance;
        this.pickupForm = pickupForm;
        this.dropTo = dropTo;
        this.distance = distance;
        //this.captain = captain;
        //this.uberAdmin = uberAdmin;
        //this.payment = payment;
        //this.riderBonus = riderBonus;
        this.ride = ride;
        this.joinSate = joinSate;
        this.rating = rating;
        this.nosOfPayment = nosOfPayment;
        this.nosOfBonus  = nosOfBonus;
    }



    public double getWalletBalance() {
        return walletBalance;
    }

    public String getPickupForm() {
        return pickupForm;
    }

    public String getDropTo() {
        return dropTo;
    }

    public double getDistance() {
        return distance;
    }

    public Captain getCaptain() {
        return captain;
    }

    public UberAdmin getUberAdmin() {
        return uberAdmin;
    }

    public Payment getPayment() {
        return payment;
    }

    public RiderBonus getRiderBonus() {
        return riderBonus;
    }

    public Ride getRide() {
        return ride;
    }

    public Date getJoinSate() {
        return joinSate;
    }

    public double getRating() {
        return rating;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void setPickupForm(String pickupForm) {
        this.pickupForm = pickupForm;
    }

    public void setDropTo(String dropTo) {
        this.dropTo = dropTo;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public void setUberAdmin(UberAdmin uberAdmin) {
        this.uberAdmin = uberAdmin;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setRiderBonus(RiderBonus riderBonus) {
        this.riderBonus = riderBonus;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public void setJoinSate(Date joinSate) {
        this.joinSate = joinSate;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public int getNosOfPayment() {
        return nosOfPayment;
    }

    public int getNosOfBonus() {
        return nosOfBonus;
    }

    public void setNosOfPayment(int nosOfPayment) {
        this.nosOfPayment = nosOfPayment;
    }

    public void setNosOfBonus(int nosOfBonus) {
        this.nosOfBonus = nosOfBonus;
    }

    @Override
    public String toString() {
        return "Rider{" + "walletBalance=" + walletBalance + ", pickupForm=" + pickupForm + ", dropTo=" + dropTo + ", distance=" + distance + ", captain=" + captain + ", uberAdmin=" + uberAdmin + ", payment=" + payment + ", riderBonus=" + riderBonus + ", ride=" + ride + ", joinSate=" + joinSate + ", rating=" + rating + '}';
    }

    RiderBonus getRiderBonus(RiderBonus riderBonus) {
        return riderBonus;
    }

    Payment getPayment(Payment payment) {
        return payment;
    }
    
}
