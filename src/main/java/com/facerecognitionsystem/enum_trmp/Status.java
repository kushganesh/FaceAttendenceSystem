package com.facerecognitionsystem.enum_trmp;

public enum Status {
    ACTIVE, INACTIVE, RETIRED, TRANSFERRED;

    public static Status fromString(String value) {
        for (Status status : Status.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid Status: " + value);
    }
}
