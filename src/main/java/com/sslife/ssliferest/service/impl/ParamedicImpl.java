package com.sslife.ssliferest.service.impl;

import com.sslife.ssliferest.model.dao.ParamedicDao;
import com.sslife.ssliferest.model.entity.Paramedic;
import com.sslife.ssliferest.service.IParamedic;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ParamedicImpl implements IParamedic {

    @Autowired
    private ParamedicDao paramedicDao;

    @Transactional
    @Override
    public Paramedic save(Paramedic paramedic) {
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
