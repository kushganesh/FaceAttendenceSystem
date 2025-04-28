package com.facerecognitionsystem.mapper;

import com.facerecognitionsystem.dto.TeacherDTO;
import com.facerecognitionsystem.entity.Teacher;

public class TeacherMapper {

    // Convert Teacher entity to TeacherDTO
    public static TeacherDTO toDTO(Teacher teacher) {
        if (teacher == null) {
            return null;
        }

        return new TeacherDTO(
                teacher.getId(),
                teacher.getUser() != null ? teacher.getUser().getId() : null, // Only userId
                teacher.getDepartment(),
                teacher.getDesignation(),
                teacher.getDateOfJoining(),
                teacher.getQualification(),
                teacher.getExperience(),
                teacher.getGender(),
                teacher.getSpecialization(),
                teacher.getStatus()
        );
    }

    // Convert TeacherDTO to Teacher entity
    public static Teacher toEntity(TeacherDTO teacherDTO) {
        if (teacherDTO == null) {
            return null;
        }

        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getId());
        // You can fetch User by userId and set it here if required
        // teacher.setUser(userRepository.findById(teacherDTO.getUserId()).orElse(null));
        teacher.setDepartment(teacherDTO.getDepartment());
        teacher.setDesignation(teacherDTO.getDesignation());
        teacher.setDateOfJoining(teacherDTO.getDateOfJoining());
        teacher.setQualification(teacherDTO.getQualification());
        teacher.setExperience(teacherDTO.getExperience());
        teacher.setGender(teacherDTO.getGender());
        teacher.setSpecialization(teacherDTO.getSpecialization());
        teacher.setStatus(teacherDTO.getStatus());

        return teacher;
    }
}
