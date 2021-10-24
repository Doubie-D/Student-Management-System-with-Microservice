package com.csu.ohio.student.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.csu.ohio.student.entity.RegisterEntity;

public interface RegisterDAO extends CrudRepository<RegisterEntity, Serializable> {

}
