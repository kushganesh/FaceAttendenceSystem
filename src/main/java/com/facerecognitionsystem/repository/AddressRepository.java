package com.facerecognitionsystem.repository;

import com.facerecognitionsystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
