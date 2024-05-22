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
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @Id
    @Column(name = "patientId")
    private int patientId;

    @Column(name = "phone")
    private int phone;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "medicalInformation")
    private String medicalInformation;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "donator")
    private boolean donator;

}
