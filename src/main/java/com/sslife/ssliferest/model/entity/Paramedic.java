package com.sslife.ssliferest.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
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
