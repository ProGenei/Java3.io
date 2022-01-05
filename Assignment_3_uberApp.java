package assignment_3_uberapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;

public class Assignment_3_uberApp {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input_uber.txt");
        if (!inputFile.exists()) {
            System.out.println("input file, " + inputFile + ", does not exist");
            System.exit(0);
        }
        File fileW = new File("output.txt");
        PrintWriter fWrite = new PrintWriter(fileW);
        Scanner input = new Scanner(inputFile);
        int i =0;
        int j = 0;
        int k = 0;
        int g = 0;
        int p = 0;
        int r = 0;
        
        int captain_size = input.nextInt();
        int UberAdmin_size = input.nextInt();
        int Ride_size = input.nextInt();
        int RiderBonus_size = input.nextInt();
        int Payment_size = input.nextInt();
        int Rider_size = input.nextInt();
        Captain[] captain_array = new Captain[captain_size];
        UberAdmin[] UberAdmin_array = new UberAdmin[UberAdmin_size];
        Ride[] Ride_array = new Ride[Ride_size];
        RiderBonus[] RiderBonus_array = new RiderBonus[RiderBonus_size];
        Payment[] Payment_array = new Payment[Payment_size];
        Rider[] Rider_array = new Rider[Rider_size];
        fWrite.println("--------------- Welcome to Uber ---------------");
        while (input.hasNextLine()) {
            String temp=input.next();
                if (temp.equalsIgnoreCase("Add_Captain")) {
                    fWrite.println("Command " + temp + " : Add a new captain record in the System");
                    fWrite.println();
                    int drivingLicenseNo = input.nextInt();
                    int totalRides = input.nextInt();
                    double rating = input.nextDouble();
                    int empid = input.nextInt();
                    String empDesc = input.next();
                    boolean onLeave = input.nextBoolean();
                    int id = input.nextInt();
                    String name = input.next();
                    String email = input.next();
                    int year = input.nextInt();
                    int month = input.nextInt();
                    int day = input.nextInt();
                    Date dateOfBirth = new Date(year, month, day);
                    char gender = input.next().charAt(0);
                    int phone = input.nextInt();
                    String address = input.next();
                    Captain captain = new Captain(drivingLicenseNo, totalRides, rating, empid, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
                    captain_array[i] = captain;
                    
                    fWrite.println("			" + "ID: " + captain_array[i].getId());
                    fWrite.println("			" + "Name: " + captain_array[i].getName());
                    fWrite.println("			" + "Email: " + captain_array[i].getEmail());
                    fWrite.println("			" + "Date of Birth: " + captain_array[i].getDateOfBirth());
                    fWrite.println("			" + "Gender: " + captain_array[i].getGender());
                    fWrite.println("			" + "Phone: " + captain_array[i].getPhone());
                    fWrite.println("			" + "Address: " + captain_array[i].getAddress());
                    fWrite.println();
                    fWrite.println("			" + "Employee ID: " + captain_array[i].getEmpid());
                    fWrite.println("			" + "Employee Description: " + captain_array[i].getEmpDesc());
                    fWrite.println("			" + "On leave: " + captain_array[i].isOnLeave());
                    fWrite.println("			" + "Driving License No: " + captain_array[i].getDrivingLicenseNo());
                    fWrite.println("			" + "Total Rides: " + captain_array[i].getTotalRides());
                    fWrite.println("			" + "Rating :" + captain_array[i].getRating());
                    fWrite.println();
                    fWrite.println("----------------------------------------------------------------");
                    i++;
                    
                }
                else if (temp.equalsIgnoreCase("Add_UberAdmin")) {
                    String department = input.next();
                    int empid = input.nextInt();
                    String empDesc = input.next();
                    boolean onLeave = input.nextBoolean();
                    int id = input.nextInt();
                    String name = input.next();
                    String email = input.next();
                    int year = input.nextInt();
                    int month = input.nextInt();
                    int day = input.nextInt();
                    Date dateOfBirth = new Date(year, month, day);
                    char gender = input.next().charAt(0);
                    int phone = input.nextInt();
                    String address = input.next();
                    UberAdmin uberAdmin = new UberAdmin(department, empid, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
                    UberAdmin_array[j] = uberAdmin;
                    fWrite.println("Command " + temp + ": Add a new Uber Admin record in the System ");
                    fWrite.println();
                    fWrite.println("			" + "ID: " + UberAdmin_array[j].getId());
                    fWrite.println("			" + "Name: " + UberAdmin_array[j].getName());
                    fWrite.println("			" + "Email: " + UberAdmin_array[j].getEmail());
                    fWrite.println("			" + "Date of Birth: " + UberAdmin_array[j].getDateOfBirth());
                    fWrite.println("			" + "Gender: " + UberAdmin_array[j].getGender());
                    fWrite.println("			" + "Phone: " + UberAdmin_array[j].getPhone());
                    fWrite.println("			" + "Address: " + UberAdmin_array[j].getAddress());
                    fWrite.println();
                    fWrite.println("			" + "Employee ID: " + UberAdmin_array[j].getEmpid());
                    fWrite.println("			" + "Employee Description: " + UberAdmin_array[j].getEmpDesc());
                    fWrite.println("			" + "On leave: " + UberAdmin_array[j].isOnLeave());
                    fWrite.println("			" + "Department: " + UberAdmin_array[j].getDepartment());
                    fWrite.println();
                    fWrite.println("----------------------------------------------------------------");
                    j++;
                }
                else if (temp.equalsIgnoreCase("Add_Ride")) { 
                    int rideID = input.nextInt();
                    String rideType = input.next();
                    int noOfSeats = input.nextInt();
                    String registrationNo = input.next();
                    Ride ride = new Ride(rideID, rideType, noOfSeats, registrationNo);
                    Ride_array[k] = ride;
                    fWrite.println("Command " + temp + ": Add a new Ride record in the System");
                    fWrite.println("Ride Details are as follows:");
                    fWrite.println();
                    fWrite.println("			" + "Ride ID: " + Ride_array[k].getRideID());
                    fWrite.println("			" + "Ride Type: " + Ride_array[k].getRideType());
                    fWrite.println("			" + "Number of Seats: " + Ride_array[k].getNoOfSeats());
                    fWrite.println("			" + "Registration No.: " + Ride_array[k].getRegistrationNo());
                    fWrite.println();
                    fWrite.println("----------------------------------------------------------------");
                    k++;
                }
                else if (temp.equalsIgnoreCase("Add_RiderBonus")) { 
                    int bonusId = input.nextInt();
                    String bonusDesc = input.next();
                    double bonusCredit = input.nextDouble();
                    RiderBonus riderBonus = new RiderBonus(bonusId, bonusDesc, bonusCredit);
                    RiderBonus_array[g] = riderBonus;
                    fWrite.println("Command " + temp + ": Add a new Rider's Bonus record in the System");
                    fWrite.println();
                    fWrite.println("			" + "BonusID: " + RiderBonus_array[g].getBonusId());
                    fWrite.println("			" + "Bonus Description: " + RiderBonus_array[g].getBonusDesc());
                    fWrite.println("			" + "bonus Kilometer(s) " + RiderBonus_array[g].getBonusCredit());
                    fWrite.println();
                    fWrite.println("----------------------------------------------------------------");
                    g++;
                } 
                else if (temp.equalsIgnoreCase("Add_Payment")) {
                    int paymentId = input.nextInt();
                    String paymentDesc = input.next();
                    double paymentAmount = input.nextDouble();
                    Payment payment = new Payment(paymentId, paymentDesc, paymentAmount);
                    Payment_array[p] = payment;
                    fWrite.println("Command " + temp + ": Add a new payment record in the System");
                    fWrite.println();
                    fWrite.println("			" + "Payment ID: " + Payment_array[p].getPaymentId());
                    fWrite.println("			" + "Payment Description: " + Payment_array[p].getPaymentDesc());
                    fWrite.println("			" + "Payment Amount :" + Payment_array[p].getPaymentAmount());
                    fWrite.println();
                    fWrite.println("----------------------------------------------------------------");
                    p++;
                }
                else if (temp.equalsIgnoreCase("Add_Rider")) {
                    double walletBalance = input.nextDouble();
                    String pickupForm = input.next();
                    String dropTo = input.next();
                    double distance = input.nextDouble();
                    //Captain captain;
                    //UberAdmin uberAdmin;
                    //Payment[] payment;
                    //RiderBonus[] riderBonus;
                    //Ride ride;
                    int yearJ = input.nextInt();
                    int monthJ = input.nextInt();
                    int dayJ = input.nextInt();
                    Date joinSate = new Date(yearJ, monthJ, dayJ);
                    double rating = input.nextDouble();
                    int id = input.nextInt();
                    String name = input.next();
                    String email = input.next();
                    int year = input.nextInt();
                    int month = input.nextInt();
                    int day = input.nextInt();
                    Date dateOfBirth = new Date(year, month, day);
                    char gender = input.next().charAt(0);
                    int phone = input.nextInt();
                    String address = input.next();
                    int nosOfPayment = input.nextInt();
                    int nosOfBonus  = input.nextInt();
                    Rider rider = new Rider(walletBalance, pickupForm, dropTo, distance, joinSate, rating, id, name, email, dateOfBirth, gender, phone, address, nosOfPayment, nosOfBonus);
                    Rider_array[r] = rider;
                    fWrite.println("Command " + temp + ": Add a new Rider record in the System");
                    fWrite.println("");
                    fWrite.println("			" + "ID: " + Rider_array[r].getId());
                    fWrite.println("			" + "Name: " + Rider_array[r].getName());
                    fWrite.println("			" + "Email: " + Rider_array[r].getEmail());
                    fWrite.println("			" + "Date of Birth: " + Rider_array[r].getDateOfBirth());
                    fWrite.println("			" + "Gender: " + Rider_array[r].getGender());
                    fWrite.println("			" + "Phone: " + Rider_array[r].getPhone());
                    fWrite.println("			" + "Address: " + Rider_array[r].getAddress());
                    fWrite.println("-------------------------------------------------------------------------------------------");
                    fWrite.println("");
                    fWrite.println("			" + "Wallet Balance: " + Rider_array[r].getWalletBalance() + " SAR,");
                    fWrite.println("");
                    fWrite.println("			" + "Pickup Location: " + Rider_array[r].getPickupForm() + ",");
                    fWrite.println("");
                    fWrite.println("			" + "Drop Location: " + Rider_array[r].getDropTo() + ",");
                    fWrite.println("");
                    fWrite.println("			" + "Distance: " + Rider_array[r].getDistance() + "KM,");
                    fWrite.println("");
                    fWrite.println("			" + "Joining Date: " + Rider_array[r].getJoinSate() + ",");
                    fWrite.println("");
                    fWrite.println("			" + "Rider Rating: " + Rider_array[r].getRating());
                    fWrite.println("-------------------------------------------------------------------------------------------");
                    fWrite.println("");
                    fWrite.println("----------------------------------------------------------------");
                    r++;
                }
                else if (temp.equalsIgnoreCase("Assign_Captain_Rider")) {
                   int captain_ID = input.nextInt();
                   int rider_ID = input.nextInt();
                   int index_of_captain = -1;
                   for (int n = 0; n < captain_array.length; n++) {
                       if (captain_array[n].getId() == captain_ID) {
                           index_of_captain = n;
                           break;
                       }
                   }
                   int index_of_rider = -1;
                   for (int n = 0; n < Rider_array.length; n++) {
                       if (Rider_array[n].getId() == rider_ID) {
                           index_of_rider = n;
                           break;
                       }
                   }
                   Rider_array[index_of_rider].setCaptain(captain_array[index_of_captain]);
                   fWrite.println("Command " + temp + ": Successfully Processed by the System, Following are the details:");
                   fWrite.println("		Rider: " + Rider_array[index_of_rider].getName());
                   fWrite.println("		Assigned to Captain: " + Rider_array[index_of_rider].getCaptain().getName());
                   fWrite.println();
                   fWrite.println("----------------------------------------------------------------");
                }
                else if (temp.equalsIgnoreCase("Assign_Ride_Rider")) {
                   int Ride_ID = input.nextInt();
                   int rider_ID = input.nextInt();
                   int index_of_ride = -1;
                   for (int n = 0; n < Ride_array.length; n++) {
                       if (Ride_array[n].getRideID() == Ride_ID) {
                           index_of_ride = n;
                           break;
                       }
                   }
                   int index_of_rider = -1;
                   for (int n = 0; n < Rider_array.length; n++) {
                       if (Rider_array[n].getId() == rider_ID) {
                           index_of_rider = n;
                           break;
                       }
                   }
                   Rider_array[index_of_rider].setRide(Ride_array[index_of_ride]);
                   fWrite.println("----------------------------------------------------------------");
                   fWrite.println("Command " + temp + ": Successfully Processed by the System, Following are the details:");
                   fWrite.println("		Rider: " + Rider_array[index_of_rider].getName());
                   fWrite.println("		Assigned to Ride:");
                   fWrite.println("Ride Details are as follows:");
                   fWrite.println();
                   fWrite.println("			Ride ID: " + Rider_array[index_of_rider].getRide().getRideID());
                   fWrite.println("			Ride Type: " + Rider_array[index_of_rider].getRide().getRideType());
                   fWrite.println("			Number of Seats: " + Rider_array[index_of_rider].getRide().getNoOfSeats());
                   fWrite.println("			Registration No.: " + Rider_array[index_of_rider].getRide().getRegistrationNo());
                   fWrite.println();
                }
                else if (temp.equalsIgnoreCase("Assign_UberAdmin_Rider")) {
                   int UberAdmin_ID = input.nextInt();
                   int rider_ID = input.nextInt();
                   int index_of_UberAdmin = -1;
                   for (int n = 0; n < Ride_array.length; n++) {
                       if (UberAdmin_array[n].getId() == UberAdmin_ID) {
                           index_of_UberAdmin = n;
                           break;
                       }
                   }
                   int index_of_rider = -1;
                   for (int n = 0; n < Rider_array.length; n++) {
                       if (Rider_array[n].getId() == rider_ID) {
                           index_of_rider = n;
                           break;
                       }
                   }
                   Rider_array[index_of_rider].setUberAdmin(UberAdmin_array[index_of_UberAdmin]);
                   fWrite.println("----------------------------------------------------------------");
                   fWrite.println("Command " + temp + ": Successfully Processed by the System, Following are the details:");
                   fWrite.println("		Rider: " + Rider_array[index_of_rider].getName());
                   fWrite.println("			Assigned to UberAdmin: " + Rider_array[index_of_rider].getUberAdmin().getName());
                   fWrite.println();
                }
                else if (temp.equalsIgnoreCase("Assign_RiderBonus_Rider")) {
                   int rider_ID = input.nextInt();
                   int index_of_rider = -1;
                   for (int n = 0; n < Rider_array.length; n++) {
                       if (Rider_array[n].getId() == rider_ID) {
                           index_of_rider = n;
                           break;
                       }
                   }
                   for (int m = 0; m < Rider_array[index_of_rider].getNosOfBonus(); m++) {
                       int RiderBonus_Rider_ID = input.nextInt();
                       int index_of_RiderBonus_Rider = -1;
                       for (int n = 0; n < Ride_array.length; n++) {
                           if (RiderBonus_array[n].getBonusId() == RiderBonus_Rider_ID) {
                               index_of_RiderBonus_Rider = n;
                               break;
                       }

                   }
                   Rider_array[index_of_rider].setRiderBonus(RiderBonus_array[index_of_RiderBonus_Rider]);
                   fWrite.println("Command " + temp + ": Successfully Processed by the System, Following are the details:");
                   fWrite.println("		 Rider Bonus added:");
                   fWrite.println("			BonusID: " + Rider_array[index_of_rider].getRiderBonus().getBonusId());
                   fWrite.println("			Bonus Description: " + Rider_array[index_of_rider].getRiderBonus().getBonusDesc());
                   fWrite.println("			bonus Kilometer(s) :" + Rider_array[index_of_rider].getRiderBonus().getBonusCredit());
                   fWrite.println();

                 }
                }
                else if (temp.equalsIgnoreCase("Assign_Payment_Rider")) {
                   int rider_ID = input.nextInt();
                   int index_of_rider = -1;
                   for (int n = 0; n < Rider_array.length; n++) {
                       if (Rider_array[n].getId() == rider_ID) {
                           index_of_rider = n;
                           break;
                       }
                   }
                   for (int m = 0; m < Rider_array[index_of_rider].getNosOfPayment(); m++) {
                       int Payment_ID = input.nextInt();
                       int index_of_Payment = -1;
                       for (int n = 0; n < Ride_array.length; n++) {
                           if (Payment_array[n].getPaymentId() == Payment_ID) {
                               index_of_Payment = n;
                               break;
                       }

                   }
                   Rider_array[index_of_rider].setPayment(Payment_array[index_of_Payment]);
                   fWrite.println("Command " + temp + ": Successfully Processed by the System, Following are the details:");
                   fWrite.println("		 Payment added:");
                   fWrite.println("");
                   fWrite.println("			Payment ID: " + Rider_array[index_of_rider].getPayment().getPaymentId());
                   fWrite.println("			Payment Description: " + Rider_array[index_of_rider].getPayment().getPaymentDesc());
                   fWrite.println("			Payment Amount :" + Rider_array[index_of_rider].getPayment().getPaymentAmount());
                   fWrite.println();
                 }
                  fWrite.println("----------------------------------------------------------------");

                }
                else if (temp.equalsIgnoreCase("Print_Report")) {
                    for (int f = 0; f < Rider_array.length; f++) {
                        String fileName  = Rider_array[f].getId() + Rider_array[f].getName().substring(0, 3) + "_Rider_Report" + ".txt";
                        File file_rider = new File(fileName);
                        PrintWriter fWriteRider = new PrintWriter(file_rider);
                        Scanner input2 = new Scanner(inputFile);
                        
                        fWriteRider.println("--------------- Welcome to Uber ---------------");
                        fWriteRider.println("--------- Current Date :  " +  new Date() + "--------");
                        fWriteRider.println("Command: " + temp);
                        fWriteRider.println();
                        fWriteRider.println("		--- Rider Detail are as Follows: ---");
                        fWriteRider.println();
                        fWriteRider.println("			" + "ID: " + Rider_array[f].getId());
                    fWriteRider.println("			" + "Name: " + Rider_array[f].getName());
                    fWriteRider.println("			" + "Email: " + Rider_array[f].getEmail());
                    fWriteRider.println("			" + "Date of Birth: " + Rider_array[f].getDateOfBirth());
                    fWriteRider.println("			" + "Gender: " + Rider_array[f].getGender());
                    fWriteRider.println("			" + "Phone: " + Rider_array[f].getPhone());
                    fWriteRider.println("			" + "Address: " + Rider_array[f].getAddress());
                    fWriteRider.println("-------------------------------------------------------------------------------------------");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Wallet Balance: " + Rider_array[f].getWalletBalance() + " SAR,");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Pickup Location: " + Rider_array[f].getPickupForm() + ",");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Drop Location: " + Rider_array[f].getDropTo() + ",");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Distance: " + Rider_array[f].getDistance() + "KM,");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Joining Date: " + Rider_array[f].getJoinSate() + ",");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "Rider Rating: " + Rider_array[f].getRating());
                    fWriteRider.println("-------------------------------------------------------------------------------------------");
                    fWriteRider.println("		--- Captain Detail are as Follows: ---");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "ID: " + Rider_array[f].getCaptain().getId());
                    fWriteRider.println("			" + "Name: " + Rider_array[f].getCaptain().getName());
                    fWriteRider.println("			" + "Email: " + Rider_array[f].getCaptain().getEmail());
                    fWriteRider.println("			" + "Date of Birth: " + Rider_array[f].getCaptain().getDateOfBirth());
                    fWriteRider.println("			" + "Gender: " + Rider_array[f].getCaptain().getGender());
                    fWriteRider.println("			" + "Phone: " + Rider_array[f].getCaptain().getPhone());
                    fWriteRider.println("			" + "Address: " + Rider_array[f].getCaptain().getAddress());
                    fWriteRider.println();
                    fWriteRider.println("			" + "Employee ID: " + Rider_array[f].getCaptain().getEmpid());
                    fWriteRider.println("			" + "Employee Description: " + Rider_array[f].getCaptain().getEmpDesc());
                    fWriteRider.println("			" + "On leave: " + Rider_array[f].getCaptain().isOnLeave());
                    fWriteRider.println("			" + "Driving License No: " + Rider_array[f].getCaptain().getDrivingLicenseNo());
                    fWriteRider.println("			" + "Total Rides: " + Rider_array[f].getCaptain().getTotalRides());
                    fWriteRider.println("			" + "Rating :" + Rider_array[f].getCaptain().getRating());
                    fWriteRider.println("                         ----------------------------------------------------------------");
                    fWriteRider.println("		--- UberAdmin Detail are as Follows: ---");
                    fWriteRider.println("");
                    fWriteRider.println("			" + "ID: " + Rider_array[f].getUberAdmin().getId());
                    fWriteRider.println("			" + "Name: " + Rider_array[f].getUberAdmin().getName());
                    fWriteRider.println("			" + "Email: " + Rider_array[f].getUberAdmin().getEmail());
                    fWriteRider.println("			" + "Date of Birth: " + Rider_array[f].getUberAdmin().getDateOfBirth());
                    fWriteRider.println("			" + "Gender: " + Rider_array[f].getUberAdmin().getGender());
                    fWriteRider.println("			" + "Phone: " + Rider_array[f].getUberAdmin().getPhone());
                    fWriteRider.println("			" + "Address: " + Rider_array[f].getUberAdmin().getAddress());
                    fWriteRider.println();
                    fWriteRider.println("			" + "Employee ID: " + Rider_array[f].getUberAdmin().getEmpid());
                    fWriteRider.println("			" + "Employee Description: " + Rider_array[f].getUberAdmin().getEmpDesc());
                    fWriteRider.println("			" + "On leave: " + Rider_array[f].getUberAdmin().isOnLeave());
                    fWriteRider.println("			" + "Department: " + Rider_array[f].getUberAdmin().getDepartment());
                    fWriteRider.println("                         ----------------------------------------------------------------");
                    fWriteRider.println("		---Payment Details are as follows:---");
                    //Payment[] payment = Rider_array[f].getPayment();
                    
                    for (int v = 0; v < Rider_array[f].getNosOfPayment(); v++) {
                        Payment paymentssss = Rider_array[f].getPayment(Payment_array[v]);
                        fWriteRider.println("			" + "Payment ID: " + paymentssss.getPaymentId());
                        fWriteRider.println("			Payment Description: " + paymentssss.getPaymentDesc());
                        fWriteRider.println("			Payment Amount :" + paymentssss.getPaymentAmount());
                        fWriteRider.println();
                    }   
                    fWriteRider.println("			-------------------------------------------------------------------------------------------");
                    fWriteRider.println("		---Bonus Details are as follows:---");
                    for (int v = 0; v < Rider_array[f].getNosOfBonus(); v++) {
                        RiderBonus riderBonuses = Rider_array[f].getRiderBonus(RiderBonus_array[v]);
                        fWriteRider.println();
                        fWriteRider.println("			" + "BonusID: " + riderBonuses.getBonusId());
                        fWriteRider.println("			Bonus Description:  " + riderBonuses.getBonusDesc());
                        fWriteRider.println("			bonus Kilometer(s) :" + riderBonuses.getBonusCredit());
                    }   
                    fWriteRider.println("			-------------------------------------------------------------------------------------------");
                    fWriteRider.println("		---Ride Details are as follows:---");
                    fWriteRider.println("Ride Details are as follows:");
                    fWriteRider.println();
                    fWriteRider.println("			Ride ID: " + Rider_array[f].getRide().getRideID());
                    fWriteRider.println("			Ride Type: " + Rider_array[f].getRide().getRideType());
                    fWriteRider.println("			Number of Seats: " + Rider_array[f].getRide().getNoOfSeats());
                    fWriteRider.println("			Registration No.: " + Rider_array[f].getRide().getRegistrationNo());
                    fWriteRider.println("			-------------------------------------------------------------------------------------------");
                    fWriteRider.flush();
                    fWriteRider.close();


                    }
                    

                    
                    }
                    
                    

                else if (temp.equalsIgnoreCase("Quit")) {
                    fWrite.println("Thank you for using Uber System, Good Bye!");
                }
                fWrite.flush();
                //fWrite.close(); 
                
        }
    }
}