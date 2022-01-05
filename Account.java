
package assignment_3_uberapp;
import java.util.Date;

public class Account {
   private int id;
   private String name;
   private String email;
   private Date dateOfBirth;
   private char gender;
   private int phone;
   private String address;

    public Account(int id, String name, String email, Date dateOfBirth, char gender, int phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", phone=" + phone + ", address=" + address + '}';
    }
   
}
