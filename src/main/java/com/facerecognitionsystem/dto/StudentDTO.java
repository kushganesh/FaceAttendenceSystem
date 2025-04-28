package com.facerecognitionsystem.dto;

import com.facerecognitionsystem.enum_trmp.Department;
import com.facerecognitionsystem.enum_trmp.Course;
import com.facerecognitionsystem.enum_trmp.Gender;
import com.facerecognitionsystem.enum_trmp.CollegeStatus;
import com.facerecognitionsystem.enum_trmp.YearOfStudy;

import java.time.LocalDate;

public class StudentDTO {

    private Long id;
    private Long userId;  // To represent the User relationship with the student
    private String rollNumber;
    private Department department;
    private Course course;
    private YearOfStudy yearOfStudy;
    private CollegeStatus collegeStatus;
    private LocalDate admissionDate;
    private LocalDate dateOfBirth;
    private Gender gender;

    public StudentDTO() {
        super();
    }

    public StudentDTO(Long id, Long userId, String rollNumber, Department department, Course course, YearOfStudy yearOfStudy, CollegeStatus collegeStatus, LocalDate admissionDate, LocalDate dateOfBirth, Gender gender) {
        this.id = id;
        this.userId = userId;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.collegeStatus = collegeStatus;
        this.admissionDate = admissionDate;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public CollegeStatus getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(CollegeStatus collegeStatus) {
        this.collegeStatus = collegeStatus;
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
