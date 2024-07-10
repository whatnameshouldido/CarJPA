package com.studymavernspringboot.carjpa;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class VehicleDto implements IVehicle {
    private Long id;
    private String company;
    private String model;
    private int makeYear;
    private VehicleType type;
    private String color;
    private int totalKm;
    private String factoryNumber;
    private String registNumber;
    private EVehicleStatus status;

    @Override
    public String toString() {
        return String.format("ID:%6d, 회사:%s, 모델:%s, 제조년도:%d, 유형:%s, 색상:%s, 총 주행거리:%d, 공장 번호:%s, 등록 번호:%s, 상태:%s",
                this.id, this.company, this.model, this.makeYear,
                (this.type != null) ? this.type.getType() : "null",
                this.color, this.totalKm, this.factoryNumber,
                this.registNumber, (this.status != null) ? this.status.name() : "null"
        );
    }
}
