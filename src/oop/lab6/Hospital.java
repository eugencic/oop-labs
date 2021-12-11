package oop.lab6;

import java.util.ArrayList;

public class Hospital {
    String name;
    Address address;
    Phone phone;
    protected ArrayList<Department> departments = new ArrayList<>();

    public Hospital(String name, Address address, Phone phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }
}


