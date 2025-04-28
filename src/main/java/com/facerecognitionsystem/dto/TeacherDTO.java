package com.facerecognitionsystem.dto;

import com.facerecognitionsystem.enum_trmp.Department;
import com.facerecognitionsystem.enum_trmp.Gender;
import com.facerecognitionsystem.enum_trmp.Status;

import java.time.LocalDate;

public class TeacherDTO {

    private Long id;
    private Long userId; // To represent the User relationship with the teacher
    private Department department;
    private String designation;
    private LocalDate dateOfJoining;
    private String qualification;
    private String experience;
    private Gender gender;
    private String specialization;
    private Status status;

    public TeacherDTO() {
        super();
    }

    public TeacherDTO(Long id, Long userId, Department department, String designation, LocalDate dateOfJoining, String qualification, String experience, Gender gender, String specialization, Status status) {
        this.id = id;
        this.userId = userId;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.qualification = qualification;
        this.experience = experience;
        this.gender = gender;
        this.specialization = specialization;
        this.status = status;
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
