package com.facerecognitionsystem.enum_trmp;

public enum Semester {
    FIRST_SEMESTER,
    SECOND_SEMESTER,
    THIRD_SEMESTER,
    FOURTH_SEMESTER,
    FIFTH_SEMESTER,
    SIXTH_SEMESTER,
    SEVENTH_SEMESTER,
    EIGHTH_SEMESTER;

    public static Semester fromString(String value) {
        for (Semester sem : Semester.values()) {
            if (sem.name().equalsIgnoreCase(value)) {
                return sem;
            }
        }
        throw new IllegalArgumentException("Invalid Semester: " + value);
    }
}

