package com.sslife.ssliferest.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "emergency")
public class Emergency implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emergencyID")
    private int emergencyId;

    @Column(name = "emergencyType")
    private String emergencyType;

    @Column(name = "location")
    private String location;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @Column(name = "dateTime")
    private Date dateTime;

}
