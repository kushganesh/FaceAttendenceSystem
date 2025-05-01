package com.facerecognitionsystem.enum_trmp;

public enum Course {
    BTECH;

    public static Course fromString(String value) {
        for (Course course : Course.values()) {
            if (course.name().equalsIgnoreCase(value)) {
                return course;
            }
        }
        throw new IllegalArgumentException("Invalid Course: " + value);
    }
}
