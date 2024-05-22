package com.sslife.ssliferest.model.dao;

import com.sslife.ssliferest.model.entity.Emergency;
import org.springframework.data.repository.CrudRepository;

public interface EmergencyDao extends CrudRepository<Emergency, Integer> {
}
