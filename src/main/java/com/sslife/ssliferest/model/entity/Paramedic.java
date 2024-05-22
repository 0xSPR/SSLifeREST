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
@Table(name = "paramedic")
public class Paramedic implements Serializable {

    @Id
    @Column(name = "paramedicId")
    private Integer paramedicId;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "identificationNumber")
    private String identificationNumber;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "employmentStatus")
    private String employmentStatus;

    @Column(name = "email")
    private String email;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "state")
    private boolean state;

}
