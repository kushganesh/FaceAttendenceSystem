package com.facerecognitionsystem.enum_trmp;

public enum CollegeStatus {
    ACTIVE, INACTIVE, PASSED_OUT, DROPPED;

    public static CollegeStatus fromString(String value) {
        for (CollegeStatus status : CollegeStatus.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid CollegeStatus: " + value);
    }
}

