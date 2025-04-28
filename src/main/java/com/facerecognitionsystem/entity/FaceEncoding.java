package com.facerecognitionsystem.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
public class FaceEncoding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "face_image_id", nullable = false)
    private FaceImage faceImage;

    @Lob  // Marking it as a large object
//    @Column(columnDefinition = "TEXT")  // MySQL-compatible for large text (JSON can be stored here)
//    @JdbcTypeCode(SqlTypes.JSON)
    private String encoding;

    private LocalDateTime createdAt = LocalDateTime.now();

    public FaceEncoding() {
        // Default constructor
    }

    public FaceEncoding(Long id, FaceImage faceImage, String encoding, LocalDateTime createdAt) {
        this.id = id;
        this.faceImage = faceImage;
        this.encoding = encoding;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FaceImage getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(FaceImage faceImage) {
        this.faceImage = faceImage;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
