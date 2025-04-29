package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
      Optional<Object> findByRole(String role);
}
