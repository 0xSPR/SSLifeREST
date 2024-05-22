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
@Table(name = "assignment")
public class Assignment implements Serializable {

    @Id
    @Column(name = "assignmentId")
    private int assignmentId;

    @Column(name = "emergencyId")
    private int emergencyId;

    @Column(name = "ambulanceId")
    private int ambulanceId;

    @Column(name = "dateTimeAssigned")
    private Date dateTimeAssigned;

    @Column(name = "status")
    private String status;
}
