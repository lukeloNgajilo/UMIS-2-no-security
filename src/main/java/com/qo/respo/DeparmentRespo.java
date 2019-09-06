package com.qo.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qo.m.Deparment;
import com.qo.respo.*;;

public interface DeparmentRespo extends JpaRepository<Deparment,Integer> {

}
