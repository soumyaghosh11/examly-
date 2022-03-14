package com.examly.housemanagement.housemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.housemanagement.housemanagement.entity.HouseEntity;

@Repository
public interface HouseRepository extends JpaRepository<HouseEntity, Integer>{

	List<HouseEntity> findByType(String houseType);

}
