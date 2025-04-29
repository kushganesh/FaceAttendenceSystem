package com.facerecognitionsystem;

import com.facerecognitionsystem.entity.Role;
import com.facerecognitionsystem.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FaceRecognitionSystemApplication implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(FaceRecognitionSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.count() == 0) {
            roleRepository.save(new Role("student"));
            roleRepository.save(new Role("teacher"));
            roleRepository.save(new Role("employee"));
            roleRepository.save(new Role("admin"));
        }

    }
}
