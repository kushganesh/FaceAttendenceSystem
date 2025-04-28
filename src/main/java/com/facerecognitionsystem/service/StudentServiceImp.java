package com.facerecognitionsystem.service;

import com.facerecognitionsystem.entity.Student;
import com.facerecognitionsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp  implements  StudentService{

    @Autowired
    private StudentRepository studentRepository;

    // Save or update a student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get student by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Get student by email
//    public Optional<Student> getStudentByEmail(String email) {
//        return studentRepository.findByEmail(email);
//    }

    // Fetch all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Fetch active students
//    public List<Student> getActiveStudents() {
//        return studentRepository.findByActive(true);
//    }

    // Remove a student by ID
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
