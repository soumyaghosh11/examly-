package com.examly.housemanagement.housemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.housemanagement.housemanagement.entity.HouseEntity;
import com.examly.housemanagement.housemanagement.repository.HouseRepository;
import com.examly.housemanagement.housemanagement.service.HouseService;

@RestController
@RequestMapping("/house")
public class Controller {
	
	@Autowired
	private HouseRepository houseRepository;
	
	@Autowired
	private HouseService service;
	
	@PostMapping("/saveHouse")
	public boolean addHouse(@RequestBody HouseEntity house) {
		return service.addHouse(house);
	}
	
	@GetMapping("/")
	public List<HouseEntity> getAll()
	{
		return service.getAllHouse();
	}
	
	@GetMapping("/getHouse")
	public HouseEntity getHouse(@RequestBody int houseId)
	{
		return service.getHouseById(houseId);
	}
	
	@DeleteMapping("/deleteHouse")
	public boolean Delete(@RequestBody int houseId)
	{
		return service.removeHouse(houseId);
	}
	
	@GetMapping("/getByType")
	public List<HouseEntity> getByType(@RequestBody String type)
	{
		return service.getHouseByType(type);
	}
	
	
}
