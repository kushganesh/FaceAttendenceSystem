package com.facerecognitionsystem.enum_trmp;


public enum Gender {
    MALE, FEMALE, OTHER;

    public static Gender fromString(String value) {
        for (Gender gender : Gender.values()) {
            if (gender.name().equalsIgnoreCase(value)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid Gender: " + value);
    }
}
