package com.facerecognitionsystem.mapper;


import com.facerecognitionsystem.dto.EmployeeDTO;
import com.facerecognitionsystem.entity.Employee;

public class EmployeeMapper {


    public static EmployeeDTO toDTO(Employee employee) {
        if (employee == null) {
            return null;
        }

        return new EmployeeDTO(
                employee.getId(),
                employee.getUser() != null ? employee.getUser().getId() : null,
                employee.getDepartment(),
                employee.getPosition(),
                employee.getDateOfJoining(),
                employee.getQualification(),
                employee.getExperience(),
                employee.getGender(),
                employee.getStatus()
        );
    }

    // Convert EmployeeDTO to Employee entity
    public static Employee toEntity(EmployeeDTO employeeDTO) {
        if (employeeDTO == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        // You can fetch User by userId and set it here if required
        // employee.setUser(userRepository.findById(employeeDTO.getUserId()).orElse(null));
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setPosition(employeeDTO.getPosition());
        employee.setDateOfJoining(employeeDTO.getDateOfJoining());
        employee.setQualification(employeeDTO.getQualification());
        employee.setExperience(employeeDTO.getExperience());
        employee.setGender(employeeDTO.getGender());
        employee.setStatus(employeeDTO.getStatus());

        return employee;
    }
}
