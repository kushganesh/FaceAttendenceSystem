package com.facerecognitionsystem.service;

import com.facerecognitionsystem.dto.UserRegistrationRequest;
import com.facerecognitionsystem.entity.*;
import com.facerecognitionsystem.enum_trmp.*;
import com.facerecognitionsystem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
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

    @Autowired
    private AddressRepository addressRepository;



    @Override
    public void registerUser(UserRegistrationRequest userRequest) throws Exception {


        // Check if email already exists
        if (userRepository.findByEmail(userRequest.getEmail()).isPresent()) {
            throw new Exception("Email already registered.");
        }

        // Check if role is valid
        Role role = (Role) roleRepository.findByRole(userRequest.getRole().trim().toLowerCase())
                .orElseThrow(() -> new RuntimeException("Invalid role"));


        // Create and save user entity
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPhone(userRequest.getPhone());
//        user.setPassword(new BCryptPasswordEncoder().encode(userRequest.getPassword())); // Encrypt password
        user.setRole(role);


        Address address = new Address();
        address.setCountry(userRequest.getCountry());
        address.setState(userRequest.getState());
        address.setCity(userRequest.getCity());
        address.setPincode(userRequest.getPincode());
        address.setStreet(userRequest.getStreet());
        addressRepository.save(address);
        user.setAddress(address);
        var userinfo = userRepository.save(user);
//        user.setAddress(address);


        // Handle role-specific registration
        if (role.getRole().equals("Student")) {
            Student student = new Student();
            student.setUser(user);
            student.setDepartment(Department.fromString(userRequest.getDepartment()));
            student.setCourse(Course.fromString(userRequest.getCourse()));
            student.setGender(Gender.fromString(userRequest.getGender()));
            student.setCollegeStatus(CollegeStatus.fromString(userRequest.getCollegeStatus()));
            student.setYearOfStudy(YearOfStudy.fromString(userRequest.getYear()));
            student.setDateOfBirth(userRequest.getDateOfBirth());
            student.setRollNumber(userRequest.getEnrollmentNumber());
            student.setAdmissionDate(userRequest.getAdmissionDate());
            studentRepository.save(student);
        } else if (role.getRole().equals("Teacher")) {
            Teacher teacher = new Teacher();
            teacher.setUser(user);
//            teacher.setDepartment(userRequest.getDepartment());
            teacher.setDesignation(userRequest.getDesignation());
            teacherRepository.save(teacher);
        } else if (role.getRole().equals("Employee")) {
            Employee employee = new Employee();
            employee.setUser(user);
//            employee.setDepartment(userRequest.getDepartment());
            employee.setPosition(userRequest.getPosition());
            employeeRepository.save(employee);
        }
    }
}
