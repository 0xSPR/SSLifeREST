package com.sslife.ssliferest.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
public class ParamedicDto implements Serializable {


    private Integer paramedicId;
    private Integer experience;
    private Integer phone;
    private String firstName;
    private String gender;
    private String identificationNumber;
    private String specialty;
    private String employmentStatus;
    private String email;
    private Date dateOfBirth;
    private String state;

}
