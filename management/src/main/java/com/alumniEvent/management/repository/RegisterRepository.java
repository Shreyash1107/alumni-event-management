package com.alumniEvent.management.repository;

import com.alumniEvent.management.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity,Integer> {

}