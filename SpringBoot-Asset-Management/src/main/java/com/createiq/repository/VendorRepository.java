package com.createiq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
