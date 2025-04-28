package com.facerecognitionsystem.entity;



import com.facerecognitionsystem.enum_trmp.*;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Department department; // Example: Administration, Maintenance, Transport

    @Column(nullable = false)
    private String position; // Example: Peon, Driver, Accountant, Clerk, Librarian

    private LocalDate dateOfJoining;

    private String qualification; // Example: Graduate, 10th Pass, Diploma etc.

    private String experience; // Example: "5 years", or you can use Integer if you prefer

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Employee() {
        super();
    }



    public Employee(Long id, User user, Department department, String position, LocalDate dateOfJoining, String qualification, String experience, Gender gender, Status status) {
        this.id = id;
        this.user = user;
        this.department = department;
        this.position = position;
        this.dateOfJoining = dateOfJoining;
        this.qualification = qualification;
        this.experience = experience;
        this.gender = gender;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
