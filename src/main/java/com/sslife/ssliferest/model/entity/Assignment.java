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
@Table(name = "assignment")
public class Assignment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignmentId")
    private Integer assignmentId;

    @Column(name = "emergencyId")
    private Integer emergencyId;

    @Column(name = "ambulanceId")
    private Integer ambulanceId;

    @Column(name = "dateTimeAssigned")
    private Date dateTimeAssigned;

    @Column(name = "status")
    private String status;
}
