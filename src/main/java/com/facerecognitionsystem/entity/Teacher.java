package com.facerecognitionsystem.entity;


import com.facerecognitionsystem.enum_trmp.*;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Department department;

    @Column(nullable = false)
    private String designation;  // Example: Professor, Assistant Professor, HOD

    private LocalDate dateOfJoining;

    private String qualification; // Example: PhD, M.Tech, etc.

    private String experience; // Example: "5 years", or you can make it Integer years

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    private String specialization; // Example: AI/ML, Networks, Civil Structures etc.

    @Enumerated(EnumType.STRING)
    private Status status; // ACTIVE / INACTIVE / RETIRED / TRANSFERRED


    public Teacher() {
        super();
    }

    public Teacher(Long id, User user, Department department, String designation, LocalDate dateOfJoining, String qualification, String experience, Gender gender, String specialization, Status status) {
        this.id = id;
        this.user = user;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.qualification = qualification;
        this.experience = experience;
        this.gender = gender;
        this.specialization = specialization;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
