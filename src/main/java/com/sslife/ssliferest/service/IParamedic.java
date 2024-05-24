package com.sslife.ssliferest.service;

import com.sslife.ssliferest.model.dto.ParamedicDto;
import com.sslife.ssliferest.model.entity.Paramedic;

public interface IParamedic {

    Paramedic save(ParamedicDto paramedic);
    Paramedic findById(Integer id);
    void delete (Paramedic paramedic);
}
