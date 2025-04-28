package com.facerecognitionsystem.enum_trmp;

public enum Department {
    CSE("Computer Science and Engineering"),
    ECE("Electronics and Communication Engineering"),
    EEE("Electrical and Electronics Engineering"),
    ME("Mechanical Engineering"),
    CE("Civil Engineering"),
    IT("Information Technology");

    private final String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFullName() {
        return departmentName;
    }
}
