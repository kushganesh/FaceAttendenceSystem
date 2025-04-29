package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.FaceEncoding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaceEncodingRepository extends JpaRepository<FaceEncoding,Long> {
}
