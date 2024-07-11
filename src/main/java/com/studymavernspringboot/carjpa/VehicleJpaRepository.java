package com.studymavernspringboot.carjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehicleJpaRepository extends JpaRepository <VehicleEntity, Long> {
    Optional<VehicleEntity> findByCompany(String company);
    List<VehicleEntity> findAllByCompanyContains(String company);
}
