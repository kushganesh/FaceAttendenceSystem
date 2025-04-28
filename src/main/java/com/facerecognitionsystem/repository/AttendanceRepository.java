package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

   // Custom query to find today's attendance for a specific user
//    List<Attendance> findByUserIdAndDateTimeBetween(Long userId, LocalDateTime startOfDay, LocalDateTime endOfDay);
//
//    // Find all attendance records for a user on a specific date
//    List<Attendance> findByUserIdAndDateTime(LocalDateTime dateTime);
//
//    // Optional: If you want to track attendance by status (Present or Absent)
//    List<Attendance> findByUserIdAndStatus(Long userId, String status);
}
