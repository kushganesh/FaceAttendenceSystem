package com.facerecognitionsystem.dto;

import java.time.LocalDate;

public class UserRegistrationRequest {

    // User Basic Details
    private String name;
    private String email;
    private String phone;
    private String password;
    private String role; // STUDENT, TEACHER, EMPLOYEE

    // Address Details
    private String street;
    private String city;
    private String state;
    private String pincode;
    private String country;

    // Student Specific Details
    private String enrollmentNumber;   // (also called rollNumber sometimes)
    private String course;             // Enum name (BTECH, MTECH, etc.)
    private Integer year;              // Year of Study (1,2,3,4)
    private String department;         // Department Enum name
    private String collegeStatus;      // Enum name (REGULAR, DROP, etc.)
    private LocalDate admissionDate;      // ISO format: yyyy-MM-dd
    private LocalDate dateOfBirth;         // ISO format: yyyy-MM-dd
    private String gender;             // Enum: MALE/FEMALE/OTHER

    // Teacher Specific Details
    private String designation;        // (Professor, Assistant Professor, etc.)
    private String specialization;     // (AI/ML, Networking, etc.)
    private String qualification;      // (PhD, M.Tech, etc.)
    private String experience;          // (e.g., "5 years")
    private LocalDate joiningDateTeacher; // ISO format: yyyy-MM-dd
    private String statusTeacher;       // Enum: ACTIVE/INACTIVE/RETIRED

    // Employee Specific Details
    private String position;           // (Peon, Driver, Clerk etc.)
    private LocalDate joiningDateEmployee; // ISO format: yyyy-MM-dd
    private String statusEmployee;      // Enum: ACTIVE/INACTIVE

    // Constructors
    public UserRegistrationRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeStatus() {
        return collegeStatus;
    }

    public void setCollegeStatus(String collegeStatus) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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

    public LocalDate getJoiningDateTeacher() {
        return joiningDateTeacher;
    }

    public void setJoiningDateTeacher(LocalDate joiningDateTeacher) {
        this.joiningDateTeacher = joiningDateTeacher;
    }

    public String getStatusTeacher() {
        return statusTeacher;
    }

    public void setStatusTeacher(String statusTeacher) {
        this.statusTeacher = statusTeacher;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getJoiningDateEmployee() {
        return joiningDateEmployee;
    }

    public void setJoiningDateEmployee(LocalDate joiningDateEmployee) {
        this.joiningDateEmployee = joiningDateEmployee;
    }

    public String getStatusEmployee() {
        return statusEmployee;
    }

    public void setStatusEmployee(String statusEmployee) {
        this.statusEmployee = statusEmployee;
    }
}
