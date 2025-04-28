package com.facerecognitionsystem.service;

import com.facerecognitionsystem.entity.Teacher;
import com.facerecognitionsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImp implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    // Save or update a teacher
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // Get teacher by ID
    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    // Fetch all teachers
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    // Fetch active teachers
//    public List<Teacher> getActiveTeachers() {
//        return teacherRepository.findByActive(true);
//    }

    // Remove a teacher by ID
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
