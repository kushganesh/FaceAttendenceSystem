package com.facerecognitionsystem.dto;

import java.time.LocalDate;
import com.facerecognitionsystem.enum_trmp.Department;
import com.facerecognitionsystem.enum_trmp.Gender;
import com.facerecognitionsystem.enum_trmp.Status;

public class EmployeeDTO {

    private Long id;
    private Long userId;
    private Department department;
    private String position;
    private LocalDate dateOfJoining;
    private String qualification;
    private String experience;
    private Gender gender;
    private Status status;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(Long id, Long userId, Department department, String position, LocalDate dateOfJoining, String qualification, String experience, Gender gender, Status status) {
        this.id = id;
        this.userId = userId;
        this.department = department;
        this.position = position;
        this.dateOfJoining = dateOfJoining;
        this.qualification = qualification;
        this.experience = experience;
        this.gender = gender;
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
