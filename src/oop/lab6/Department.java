package oop.lab6;

import java.util.ArrayList;

public class Department {
    String name;
    protected ArrayList<Staff> staff = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addStaff(Staff staff) {
        this.staff.add(staff);
    }
}
