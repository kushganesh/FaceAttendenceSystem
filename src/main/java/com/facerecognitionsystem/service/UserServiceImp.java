package com.facerecognitionsystem.service;

import com.facerecognitionsystem.dto.UserRegistrationRequest;
import com.facerecognitionsystem.entity.Role;
import com.facerecognitionsystem.entity.User;
import com.facerecognitionsystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
      public void registerUser(UserRegistrationRequest userRequest)  {


        // Check if email already exists
        if (userRepository.findByEmail(userRequest.getEmail()).isPresent()) {
            throw new Exception("Email already registered.");
        }

        // Check if role is valid
        Role role = (Role) roleRepository.findByName(userRequest.getRole())
                .orElseThrow(() -> new RuntimeException("Invalid role"));


        // Create and save user entity
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPhone(userRequest.getPhone());
        user.setPassword(new BCryptPasswordEncoder().encode(userRequest.getPassword())); // Encrypt password
        user.setRole(role);

        userRepository.save(user);

        // Handle role-specific registration
        if (role.getName().equals("Student")) {
            Student student = new Student();
            student.setUser(user);
            student.setEnrollmentNumber(userRequest.getEnrollmentNumber());
            student.setCourse(userRequest.getCourse());
            student.setYear(userRequest.getYear());
            studentRepository.save(student);
        } else if (role.getName().equals("Teacher")) {
            Teacher teacher = new Teacher();
            teacher.setUser(user);
            teacher.setDepartment(userRequest.getDepartment());
            teacher.setDesignation(userRequest.getDesignation());
            teacherRepository.save(teacher);
        } else if (role.getName().equals("Employee")) {
            Employee employee = new Employee();
            employee.setUser(user);
            employee.setDepartment(userRequest.getDepartment());
            employee.setPosition(userRequest.getPosition());
            employeeRepository.save(employee);
        }
    }
}
