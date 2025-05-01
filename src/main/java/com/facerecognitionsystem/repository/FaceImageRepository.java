package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.FaceImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaceImageRepository extends JpaRepository<FaceImage,Long> {
}
