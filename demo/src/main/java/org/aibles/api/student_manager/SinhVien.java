package org.aibles.api.student_manager;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "dayOfBirth")
    private String dayOfBirth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;

    public SinhVien() {

    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDayOfBirth() {
        return dayOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
