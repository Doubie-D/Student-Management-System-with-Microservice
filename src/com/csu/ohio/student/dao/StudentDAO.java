package com.csu.ohio.student.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.csu.ohio.student.entity.StudentEntity;

public interface StudentDAO extends CrudRepository<StudentEntity, Serializable>
{
	

}
