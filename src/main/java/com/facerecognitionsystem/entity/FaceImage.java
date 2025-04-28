package com.facerecognitionsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String imagePath;

    private LocalDateTime createdAt = LocalDateTime.now();

    FaceImage() {
        super();
    }

    public FaceImage(Long id, User user, String imagePath, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.imagePath = imagePath;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
