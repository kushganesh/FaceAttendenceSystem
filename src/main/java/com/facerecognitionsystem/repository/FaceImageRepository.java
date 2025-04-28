package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.FaceImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaceImageRepository extends JpaRepository<FaceImage,Long> {
}
