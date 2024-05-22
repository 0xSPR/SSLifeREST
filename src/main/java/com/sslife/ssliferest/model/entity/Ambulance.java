package com.sslife.ssliferest.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ambulance")
public class Ambulance implements Serializable {

    @Id
    @Column(name = "ambulanceId")
    private int ambulanceId;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "vehicleId")
    private String vehicleId;

    @Column(name = "currentLocation")
    private String currentLocation;

    @Column(name = "status")
    private String status;

    @Column(name = "availability")
    private String availability;

    @Column(name = "plate")
    private String plate;
}
