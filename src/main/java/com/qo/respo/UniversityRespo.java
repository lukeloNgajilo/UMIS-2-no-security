package com.qo.respo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qo.m.University;
@Repository
public interface UniversityRespo extends JpaRepository<University,Integer> {

}
