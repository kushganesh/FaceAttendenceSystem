package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
//    List<Teacher> findByActive(boolean b);
}
