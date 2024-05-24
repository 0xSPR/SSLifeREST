package com.sslife.ssliferest.controller;

import com.sslife.ssliferest.model.dto.ParamedicDto;
import com.sslife.ssliferest.model.entity.Paramedic;
import com.sslife.ssliferest.service.IParamedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ParamedicController {

    @Autowired
    private IParamedic paramedicService;

    @PostMapping("paramedic")
    @ResponseStatus(HttpStatus.CREATED)
    public ParamedicDto create(@RequestBody ParamedicDto paramedicDto) {

        Paramedic paramedicSave  = paramedicService.save(paramedicDto);

        return ParamedicDto.builder()
                .paramedicId(paramedicSave.getParamedicId())
                .experience(paramedicSave.getExperience())
                .phone(paramedicSave.getPhone())
                .firstName(paramedicSave.getFirstName())
                .gender(paramedicSave.getGender())
                .identificationNumber(paramedicSave.getIdentificationNumber())
                .specialty(paramedicSave.getSpecialty())
                .employmentStatus(paramedicSave.getEmploymentStatus())
                .email(paramedicSave.getEmail())
                .dateOfBirth(paramedicSave.getDateOfBirth())
                //.state(paramedicSave.getState())
                .build();
    }

    @PutMapping("paramedic")
    @ResponseStatus(HttpStatus.OK)
    public ParamedicDto update(@RequestBody ParamedicDto paramedicDto) {

        Paramedic paramedicUpdate  = paramedicService.save(paramedicDto);

        return ParamedicDto.builder()
                .paramedicId(paramedicUpdate.getParamedicId())
                .experience(paramedicUpdate.getExperience())
                .phone(paramedicUpdate.getPhone())
                .firstName(paramedicUpdate.getFirstName())
                .gender(paramedicUpdate.getGender())
                .identificationNumber(paramedicUpdate.getIdentificationNumber())
                .specialty(paramedicUpdate.getSpecialty())
                .employmentStatus(paramedicUpdate.getEmploymentStatus())
                .email(paramedicUpdate.getEmail())
                .dateOfBirth(paramedicUpdate.getDateOfBirth())
                //.state(paramedicUpdate.getState())
                .build();
    }

    @DeleteMapping("paramedic/{id}")
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        Map<String, Object> response = new HashMap<>();

        try {

            Paramedic paramedicDelete = paramedicService.findById(id);
            paramedicService.delete(paramedicDelete);

            return new ResponseEntity<>(paramedicDelete, HttpStatus.NO_CONTENT);
        }catch (DataAccessException exDt){

            response.put("message", exDt.getMessage());
            response.put("paramedic", null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("paramedic/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ParamedicDto showById(@PathVariable Integer id) {

        Paramedic paramedic = paramedicService.findById(id);

        return ParamedicDto.builder()
                .paramedicId(paramedic.getParamedicId())
                .experience(paramedic.getExperience())
                .phone(paramedic.getPhone())
                .firstName(paramedic.getFirstName())
                .gender(paramedic.getGender())
                .identificationNumber(paramedic.getIdentificationNumber())
                .specialty(paramedic.getSpecialty())
                .employmentStatus(paramedic.getEmploymentStatus())
                .email(paramedic.getEmail())
                .dateOfBirth(paramedic.getDateOfBirth())
                //.state(paramedicUpdate.getState())
                .build();
    }

}
