package com.facerecognitionsystem.service;

import com.facerecognitionsystem.dto.UserRegistrationRequest;

public interface UserService {

     void registerUser(UserRegistrationRequest userRequest) throws Exception;
}
