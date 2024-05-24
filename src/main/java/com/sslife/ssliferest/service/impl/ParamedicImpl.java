package com.sslife.ssliferest.service.impl;

import com.sslife.ssliferest.model.dao.ParamedicDao;
import com.sslife.ssliferest.model.dto.ParamedicDto;
import com.sslife.ssliferest.model.entity.Paramedic;
import com.sslife.ssliferest.service.IParamedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ParamedicImpl implements IParamedic {

    @Autowired
    private ParamedicDao paramedicDao;

    @Transactional
    @Override
    public Paramedic save(ParamedicDto paramedicDto) {
        Paramedic paramedic = Paramedic.builder()
                .paramedicId(paramedicDto.getParamedicId())
                .experience(paramedicDto.getExperience())
                .phone(paramedicDto.getPhone())
                .firstName(paramedicDto.getFirstName())
                .gender(paramedicDto.getGender())
                .identificationNumber(paramedicDto.getIdentificationNumber())
                .specialty(paramedicDto.getSpecialty())
                .employmentStatus(paramedicDto.getEmploymentStatus())
                .email(paramedicDto.getEmail())
                .dateOfBirth(paramedicDto.getDateOfBirth())
                //.state(paramedicDto.getState())
                .build();
        return paramedicDao.save(paramedic);
    }

    @Transactional(readOnly = true)
    @Override
    public Paramedic findById(Integer id) {
         return paramedicDao.findById(id).orElse(null);
                           //.orElseThrow(() -> new EntityNotFoundException("Paramedic with id " + id + " not found"));

    }

    @Transactional
    @Override
    public void delete(Paramedic paramedic) {
        paramedicDao.delete(paramedic);
    }
}
