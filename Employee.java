
package assignment_3_uberapp;

import java.util.Date;

public class Employee extends Account {
    private int empid;
    private String empDesc;
    private boolean onLeave;

    public Employee(int empid, String empDesc, boolean onLeave, int id, String name, String email, Date dateOfBirth, char gender, int phone, String address) {
        super(id, name, email, dateOfBirth, gender, phone, address);
        this.empid = empid;
        this.empDesc = empDesc;
        this.onLeave = onLeave;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpDesc() {
        return empDesc;
    }

    public boolean isOnLeave() {
        return onLeave;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpDesc(String empDesc) {
        this.empDesc = empDesc;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

    @Override
    public String toString() {
        return "Employee{" + "empid=" + empid + ", empDesc=" + empDesc + ", onLeave=" + onLeave + '}';
    }
    
}
