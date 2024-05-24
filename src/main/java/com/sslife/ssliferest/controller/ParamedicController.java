package com.sslife.ssliferest.controller;

import com.sslife.ssliferest.model.entity.Paramedic;
import com.sslife.ssliferest.service.IParamedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ParamedicController {

    @Autowired
    private IParamedic paramedicService;

    @PostMapping("paramedic")
    public Paramedic create(@RequestBody Paramedic paramedic) {
        return paramedicService.save(paramedic);
    }

    @PutMapping("paramedic")
    public Paramedic update(@RequestBody Paramedic paramedic) {
        return paramedicService.save(paramedic);
    }

    @DeleteMapping("paramedic/{id}")
    public void delete(@PathVariable Integer id) {
        Paramedic paramedicDelete = paramedicService.findById(id);
        paramedicService.delete(paramedicDelete);
    }

    @GetMapping("paramedic/{id}")
    public Paramedic showById(@PathVariable Integer id) {
        return paramedicService.findById(id);
    }

}
