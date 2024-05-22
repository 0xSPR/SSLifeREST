package com.sslife.ssliferest.service;

import com.sslife.ssliferest.model.entity.Paramedic;

public interface IParamedic {

    Paramedic save(Paramedic paramedic);
    Paramedic findById(Integer id);
    void delete (Paramedic paramedic);
}
