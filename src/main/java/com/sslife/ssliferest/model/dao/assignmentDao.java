package com.sslife.ssliferest.model.dao;


import com.sslife.ssliferest.model.entity.Assignment;
import org.springframework.data.repository.CrudRepository;

public interface assignmentDao extends CrudRepository<Assignment, Integer> {
}
