package com.go2climb.go2climbapi.application.agencies.domain.service;

import com.go2climb.go2climbapi.application.agencies.domain.model.entity.Agency;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface AgencyService {

    List<Agency> getAll();

    Page<Agency> getAll(Pageable pageable);

    //GET BY EMAIL
    Agency getByEmail(String email);

    //GET BY password
    Agency getByPassword(String name);

    //GET BY NAME
    Agency getByName(String name);
    //GET BY LOCATION
    Agency getByLocation(String location);

    // Create a new agency
    Agency create(Agency agency);

    // Update agency
    Agency update(Long agencyId, Agency agency);

    // Get info agency by id
    Agency getInfoAgencyById(Long agencyId);

    ResponseEntity<?> delete(Long agencyId);
}
