package com.facerecognitionsystem.enum_trmp;

public enum YearOfStudy {
    FIRST_YEAR,
    SECOND_YEAR,
    THIRD_YEAR,
    FOURTH_YEAR;

    public static YearOfStudy fromString(String value) {
        for (YearOfStudy yearOfStudy : YearOfStudy.values()) {
            if (yearOfStudy.name().equalsIgnoreCase(value)) {
                return yearOfStudy;
            }
        }
        throw new IllegalArgumentException("Invalid YearOfStudy: " + value);
    }
}
