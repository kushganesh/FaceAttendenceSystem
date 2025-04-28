package com.facerecognitionsystem.entity;

import com.facerecognitionsystem.enum_trmp.*;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, unique = true)
    private String rollNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Department department;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Course course;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private YearOfStudy yearOfStudy;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CollegeStatus collegeStatus;

    private LocalDate admissionDate;

    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;


    public Student() {
        super();
    }

    public Student(Long id, User user, String rollNumber, Department department, Course course, YearOfStudy yearOfStudy, CollegeStatus collegeStatus, LocalDate admissionDate, LocalDate dateOfBirth, Gender gender) {
        this.id = id;
        this.user = user;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.collegeStatus = collegeStatus;
        this.admissionDate = admissionDate;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

    public CollegeStatus getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(CollegeStatus collegeStatus) {
        this.collegeStatus = collegeStatus;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
