package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
//    List<Teacher> findByActive(boolean b);
}
