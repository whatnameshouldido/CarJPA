package com.studymavernspringboot.carjpa;

import java.util.List;

public interface IVehicleService {
    IVehicle findById(Long id);
    IVehicle findByCompany(String company);
    List<IVehicle> getAllList();
    IVehicle insert(IVehicle vehicle) throws Exception;
    boolean remove(Long id) throws Exception;
    IVehicle update(Long id, IVehicle vehicle) throws Exception;
    List<IVehicle> findAllByCompanyContains(String company);
}