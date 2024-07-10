package com.studymavernspringboot.carjpa;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="carjpa_tbl")
public class VehicleEntity implements IVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 50)
    private String company;

    @NotNull
    @Column(length = 50)
    private String model;

    @NotNull
    @Column(length = 10)
    private int makeYear;

    @NotNull
    @ManyToOne
    @Column(length = 50)
    private VehicleType type;

    @NotNull
    @Column(length = 50)
    private String color;

    @NotNull
    @Column(length = 10)
    private int totalKm;

    @NotNull
    @Column(length = 50)
    private String factoryNumber;

    @NotNull
    @Column(length = 50)
    private String registNumber;

    @NotNull
    @Column(length = 50)
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
