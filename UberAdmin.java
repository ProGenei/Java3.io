
package assignment_3_uberapp;

import java.util.Date;

public class UberAdmin extends Employee {
    private String department;

    public UberAdmin(String department, int empid, String empDesc, boolean onLeave, int id, String name, String email, Date dateOfBirth, char gender, int phone, String address) {
        super(empid, empDesc, onLeave, id, name, email, dateOfBirth, gender, phone, address);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "UberAdmin{" + "department=" + department + '}';
    }
    
}
