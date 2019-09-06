package com.qo.respo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qo.m.*;

@Repository
public interface UserRespo extends JpaRepository<Users, Integer> {

    Users findByEmail(String email);

}
