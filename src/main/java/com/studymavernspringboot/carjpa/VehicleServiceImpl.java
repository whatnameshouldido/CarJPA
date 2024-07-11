package com.studymavernspringboot.carjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements IVehicleService {
    @Autowired
    private VehicleJpaRepository vehicleJpaRepository;

    @Override
    public IVehicle findById(Long id) {
        if (id == null || id <= 0) {
            return null;
        }
        Optional<VehicleEntity> entity = this.vehicleJpaRepository.findById(id);
        return entity.orElse(null);
    }
}
