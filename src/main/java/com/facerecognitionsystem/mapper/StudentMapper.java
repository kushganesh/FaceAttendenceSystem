package com.facerecognitionsystem.mapper;
import com.facerecognitionsystem.dto.StudentDTO;
import com.facerecognitionsystem.entity.Student;

public class StudentMapper {

    // Convert Student entity to StudentDTO
    public static StudentDTO toDTO(Student student) {
        if (student == null) {
            return null;
        }

        return new StudentDTO(
                student.getId(),
                student.getUser() != null ? student.getUser().getId() : null, // Only userId
                student.getRollNumber(),
                student.getDepartment(),
                student.getCourse(),
                student.getYearOfStudy(),
                student.getCollegeStatus(),
                student.getAdmissionDate(),
                student.getDateOfBirth(),
                student.getGender()
        );
    }

    // Convert StudentDTO to Student entity
    public static Student toEntity(StudentDTO studentDTO) {
        if (studentDTO == null) {
            return null;
        }

        Student student = new Student();
        student.setId(studentDTO.getId());
        // You can fetch User by userId and set it here if required
        // student.setUser(userRepository.findById(studentDTO.getUserId()).orElse(null));
        student.setRollNumber(studentDTO.getRollNumber());
        student.setDepartment(studentDTO.getDepartment());
        student.setCourse(studentDTO.getCourse());
        student.setYearOfStudy(studentDTO.getYearOfStudy());
        student.setCollegeStatus(studentDTO.getCollegeStatus());
        student.setAdmissionDate(studentDTO.getAdmissionDate());
        student.setDateOfBirth(studentDTO.getDateOfBirth());
        student.setGender(studentDTO.getGender());

        return student;
    }
}
