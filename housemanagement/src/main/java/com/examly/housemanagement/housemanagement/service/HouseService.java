package com.examly.housemanagement.housemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examly.housemanagement.housemanagement.entity.HouseEntity;
import com.examly.housemanagement.housemanagement.repository.HouseRepository;

@Component
public class HouseService {
	
	@Autowired
	private HouseRepository houseRepository;
	public boolean addHouse(HouseEntity houseEntity)
	{
		houseRepository.save(houseEntity);
		return true;
	}
	
	public List<HouseEntity> getAllHouse()
	{
		return houseRepository.findAll();
	}
	
	public HouseEntity getHouseById(int houseId)
	{
		return houseRepository.findById(houseId).orElse(null);
	}
	public boolean removeHouse(int houseId)
	{
		houseRepository.deleteById(houseId);
		return true;
	}
	public List<HouseEntity> getHouseByType(String houseType)
	{
		return houseRepository.findByType(houseType);
	}
	
}
