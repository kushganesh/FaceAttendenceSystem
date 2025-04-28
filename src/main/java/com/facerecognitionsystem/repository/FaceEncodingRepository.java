package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.FaceEncoding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaceEncodingRepository extends JpaRepository<FaceEncoding,Long> {
}
