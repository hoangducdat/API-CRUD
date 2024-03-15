package org.aibles.api.employee_manager;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_manager")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String employee_name;
    @Column
    private String position;
    @Column
    private String dayOfBirth;
    @Column
    private String address;

    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDayOfBirth() {
        return dayOfBirth;
    }
    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
