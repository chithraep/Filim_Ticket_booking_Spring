package com.demo.mvc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mvc.beans.CurrentDateOperation;

@Repository
public interface OpeningDate extends JpaRepository<CurrentDateOperation, Long>{

}
